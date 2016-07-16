package com.ypw.MutiCallBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-16 17:03
 */
public class Caller {
    private List<Callbackable> callbackList = new ArrayList<>();

    public Caller() {
    }

    public Caller(List<Callbackable> callbackList) {
        this.callbackList = callbackList;
    }

    public void register(Callbackable callbackable) {
        callbackList.add(callbackable);
    }

    public void call() {
        for (Callbackable callbackable : callbackList) {
            callbackable.execute();
        }
    }

}
