package com.ypw.callback.demo;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-12 20:37
 */
public interface CallBackable<T> {
    void execute(T o);
}
