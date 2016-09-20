package com.ypw.callback.withParamCallBack;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-16 17:32
 */
public class InvokeTest {

    public static void main(String[] args) {

        String attr = "属性参数";
        Caller caller1 = new Caller(new Executor<String>(attr));
        caller1.call();

        String param = "方法参数";
        Caller<String> caller = new Caller<String>(new Executor());
        caller.call(param);

        User user = new User();
        Caller<User> caller2 = new Caller<User>(new Executor());
        caller2.call(user);

        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "ypw");
        Caller<Map> caller3 = new Caller<Map>(new Executor());
        caller3.call(map);
    }
}
