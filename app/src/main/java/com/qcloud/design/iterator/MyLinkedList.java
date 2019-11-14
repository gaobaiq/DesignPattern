package com.qcloud.design.iterator;

/**
 * Description: 链表实现的集合
 * Author: gaobaiqiang
 * 2019-11-14 14:41.
 */
public class MyLinkedList<T> implements MyList<T> {

    private int size;   // 存放的元素个数,会默认初始化为0
    private Node<T> first;  // 首节点，默认初始化为null

    @Override
    public MyIterator<T> iterator() {
        return new Iterator();
    }

    /**
     * 添加元素
     * */
    @Override
    public boolean add(T t) {
        if (size == 0) {
            first = new Node<T>(t,null);
            size++;
            return true;
        }
        Node<T> node = first;
        while(node.next!=null) {
            node = node.next;
        }
        node.next = new Node<T>(t,null);
        size++;
        return true;
    }

    /**
     * 获取元素
     * */
    @Override
    public T get(int index) {
        Node<T> node = first;
        while(--index>=0) {
            node = node.next;
        }
        return node.data;
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
    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> node = first;
        while(--index > 0) {
            node = node.next;
        }
        T element = node.next.data;
        node.next = node.next.next;
        size--;
        return element;
    }

    /**
     * 移除元素
     * */
    @Override
    public boolean remove(T element) {
        if (element == null) {
            if(first.data == null) {
                first = first.next;
                size--;
                return true;
            }
            Node<T> node = first;
            do {
                if (node.next.data == null) {
                    node.next = node.next.next;
                    size--;
                    return true;
                }
                node = node.next;
            } while(node.next!=null);
        } else {
            if (first.data.equals(element)) {
                first = first.next;
                size--;
                return true;
            }
            Node<T> node = first;
            do {
                if (node.next.data.equals(element)) {
                    node.next = node.next.next;
                    size--;
                    return true;
                }
                node = node.next;

            } while(node.next!=null);
        }
        return false;
    }

    /**
     * 更新元素
     * */
    @Override
    public boolean set(int index, T element) {
        if (index < 0 || index >= size) {
            return false;
        }
        Node<T> node = first;
        while(--index>0) {
            node = node.next;
        }
        node.data = element;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * 链表节点
     * */
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data,Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * 遍历器
     * */
    private class Iterator implements MyIterator<T> {
        private Node<T> next; //下一个节点

        Iterator(){
            next = first;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public T next() {
            T data = next.data;
            next = next.next;
            return data;
        }

        @Override
        public T remove() {
            return null;
        }
    }
}
