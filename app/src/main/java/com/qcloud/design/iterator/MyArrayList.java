package com.qcloud.design.iterator;

import java.util.Arrays;

/**
 * Description: 容量可以自动增长的数组实现的集合
 * Author: gaobaiqiang
 * 2019-11-14 14:28.
 */
public class MyArrayList<T> implements MyList<T> {
    private int size;   // 存放的元素个数,会默认初始化为0
    private Object[] defaultList;   // 使用数组存放元素
    private static final int defaultLength = 10;    // 默认长度

    /**
     * 默认构造函数
     * */
    public MyArrayList() {
        defaultList = new Object[defaultLength];
    }

    @Override
    public MyIterator<T> iterator() {
        return new Iterator();
    }

    /**
     * 大小自动增长
     * */
    private void ensureCapacity(int capacity) {
        int nowLength = defaultList.length;
        if (capacity >= nowLength) {
            nowLength = nowLength + (nowLength >> 1);
            if (nowLength < 0) {
                // 溢出
                nowLength = Integer.MAX_VALUE;
            }

            defaultList = Arrays.copyOf(defaultList, nowLength);
        }
    }

    /**
     * 添加元素
     * */
    @Override
    public boolean add(T t) {
        ensureCapacity(size+1);
        defaultList[size++] = t;
        return true;
    }

    /**
     * 获取元素
     * */
    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) defaultList[index];
    }

    /**
     * 移除最后的元素
     * */
    @Override
    public T remove() {
        return remove(size-1);
    }

    /**
     * 移除指定元素
     * */
    @SuppressWarnings("unchecked")
    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        T element = (T) defaultList[index];
        if(index != size-1) {
            System.arraycopy(defaultList, index + 1, defaultList, index, size - index - 1);
        }
        size--;
        return element;
    }

    /**
     * 移除元素
     * */
    @Override
    public boolean remove(T element) {
        if (element == null) {
            for (int i = 0; i<size; i++)
                if(defaultList[i] == null) {
                    System.arraycopy(defaultList, i+1, defaultList, i,size-i-1);
                    size--;
                    return true;
                }
        } else {
            for (int i = 0; i<size; i++)
                if (defaultList[i].equals(element)) {
                    System.arraycopy(defaultList, i+1, defaultList, i,size-i-1);
                    size--;
                    return true;
                }
        }
        return false;
    }

    /**
     * 更新元素
     * */
    @Override
    public boolean set(int index,T element) {
        if (index < 0 || index >= size) {
            return false;
        }
        defaultList[index] = element;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * 迭代器
     * */
    private class Iterator implements MyIterator<T>{
        private int next;

        @Override
        public boolean hasNext() {
            return next < size;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T next() {
            return (T) defaultList[next++];
        }

        @Override
        public T remove() {
            return null;
        }
    }
}
