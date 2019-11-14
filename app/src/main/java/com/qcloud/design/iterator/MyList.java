package com.qcloud.design.iterator;

/**
 * Description: 集合接口
 * Author: gaobaiqiang
 * 2019-11-14 14:25.
 */
public interface MyList<T> {
    /**返回一个遍历器*/
    MyIterator<T> iterator();

    /**添加元素到列表*/
    boolean add(T t);

    /**得到元素*/
    T get(int index);

    /**删除最后一个元素*/
    T remove();

    /**删除指定元素*/
    boolean remove(T element);

    /**删除指定位置元素*/
    T remove(int index);

    /**修改指定位置值*/
    boolean set(int index,T element);

    /**集合大小*/
    int size();
}
