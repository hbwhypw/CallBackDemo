package com.ypw.proxy.dynamicProxy;

/**
 * @Description: 实际目标行动者
 * @author: hbwhypw
 * @date: 2016-09-20 23:06
 */
public class TargetActer implements TargetAction {
    @Override
    public String buy(String ticket) {
        System.out.println("去买 " + ticket);
        return "买到 " + ticket;
    }

    @Override
    public void bringBack() {
        System.out.println("取回票");
    }
}
