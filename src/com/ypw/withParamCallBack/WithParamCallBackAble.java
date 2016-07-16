package com.ypw.withParamCallBack;

/**
 * @Description: TODO 带参回调
 * @author: hbwhypw
 * @date: 2016-07-16 17:26
 */
public interface WithParamCallBackAble<T> {
    void execute(T param);

    void execute();
}
