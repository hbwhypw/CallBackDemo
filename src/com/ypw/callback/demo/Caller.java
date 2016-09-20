package com.ypw.callback.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-12 20:41
 */
public class Caller {
    private UpdateCallBack<HashMap<String, Object>> createCallBack;
    private HashMap<String, Object> param;
    private List<CallBackable> list = new ArrayList<>();

    public Caller() {
    }

    public Caller(UpdateCallBack callBackable, HashMap<String, Object> param) {
        this.createCallBack = callBackable;
        this.param = param;
    }

    public void register(CallBackable callBackable) {
        list.add(callBackable);
    }

    public void call() {
        System.out.println("caller calling one.");
        createCallBack.execute(param);
        System.out.println("call end");
    }

    public void callAll() {
        System.out.println("caller calling a list.");
        for (CallBackable callee : list) {
            callee.execute(param);
        }

        System.out.println("caller call end");
    }

}
