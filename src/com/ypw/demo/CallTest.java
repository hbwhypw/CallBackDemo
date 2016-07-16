package com.ypw.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-12 20:43
 */
public class CallTest {
    public static void main(String[] args) {
//        CreateCallBack createCallBack = new CreateCallBack();
//        Caller caller = new Caller(createCallBack);
//        caller.call();

        UpdateCallBack<Map<String, Object>> updateCallBack = new UpdateCallBack<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("id","123");
        map.put("name","ypw");
        Caller caller = new Caller(updateCallBack, map);
        caller.call();
//        Caller callerAll = new Caller();
//        callerAll.register(createCallBack);
//        callerAll.register(updateCallBack);
//
//        callerAll.callAll();
    }
}
