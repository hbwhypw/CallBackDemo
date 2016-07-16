package com.ypw.singleCallBack;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-16 17:03
 */
public class Caller {
    private Callbackable callbackable;

    public Caller(Callbackable callbackable) {
        this.callbackable = callbackable;
    }

    public void call() {
        callbackable.execute();
    }

}
