package com.ypw.proxy;

import com.ypw.proxy.dynamicProxy.TargetActer;
import com.ypw.proxy.dynamicProxy.TargetAction;
import com.ypw.proxy.dynamicProxy.TargetActionProxy;

import java.lang.reflect.Proxy;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-09-20 23:08
 */
public class DynamicProxyExample {
    public static void main(String[] args) {
        TargetActer targetActer = new TargetActer();
//        代理人实例
        TargetActionProxy targetActionProxy = new TargetActionProxy(targetActer);

//        申请代理人类
        ClassLoader TargetActerClass = TargetActer.class.getClassLoader();

        Class<?>[] interfaces = TargetActer.class.getInterfaces();

        TargetAction proxyInstance = (TargetAction)Proxy.newProxyInstance(TargetActerClass, interfaces, targetActionProxy);
        String result = proxyInstance.buy("票");
        System.out.println(result);
    }
}
