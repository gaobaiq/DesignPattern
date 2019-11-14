package com.qcloud.design.iterator;

/**
 * Description: 迭代器接口
 * Author: gaobaiqiang
 * 2019-11-14 14:25.
 */
public interface MyIterator<T> {
    /**是否还有下一个元素*/
    boolean hasNext();

    /**得到下一个元素*/
    T next();

    /**移除最后一个元素*/
    T remove();
}
