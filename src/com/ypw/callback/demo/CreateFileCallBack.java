package com.ypw.callback.demo;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-13 0:23
 */
public abstract class CreateFileCallBack<T> implements CallBackable<T> {
    private T param;

    public CreateFileCallBack(T param) {
    }

}
