package com.ypw.callback.withParamCallBack;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-16 17:30
 */
public class Caller<T> {
    private WithParamCallBackAble withParamCallBackAble;

    public Caller(WithParamCallBackAble withParamCallBackAble) {
        this.withParamCallBackAble = withParamCallBackAble;
    }

    public void call() {
        withParamCallBackAble.execute();
    }

    public void call(T param) {
        withParamCallBackAble.execute(param);
    }
}
