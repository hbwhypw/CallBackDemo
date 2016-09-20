package com.ypw.callback.demo;


import java.util.Map;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-12 20:40
 */
public class UpdateCallBack<T extends Map<String, Object>> implements CallBackable<T> {

    @Override
    public void execute(T map) {
        String id = map.get("id").toString();
        String name = map.get("name").toString();
        System.out.println(id);
        System.out.println(name);
    }
}
