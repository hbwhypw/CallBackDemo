package com.ypw.withParamCallBack;


import java.util.Map;
import java.util.Set;

/**
 * @Description: TODO 带参回调执行者
 * @author: hbwhypw
 * @date: 2016-07-16 17:01
 */
public class Executor<T> implements WithParamCallBackAble<T> {

    private T attribute;

    public Executor() {
    }

    public Executor(T attribute) {
        this.attribute = attribute;
    }

    @Override
    public void execute(T param) {
        if (param instanceof String) {
            System.out.println("我是执行方法带参执行者， 回调执行中，参数是 " + param);
        } else if (param instanceof Map) {
            System.out.println("我是执行方法带参执行者， 回调执行中，参数有");
            Map params = (Map)param;
            Set keySet = params.keySet();
            for (Object key : keySet) {
                System.out.println("参数有："+params.get(key));
            }
        } else {
            System.out.println("我是执行方法带参执行者， 回调执行中，参数是 " + param);
        }
    }

    @Override
    public void execute() {
        System.out.println("我是构造器带参执行者，回调执行中，参数是 " + attribute);
    }
}
