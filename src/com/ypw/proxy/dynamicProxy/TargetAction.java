package com.ypw.proxy.dynamicProxy;

/**
 * @Description: 目标行为
 * @author: hbwhypw
 * @date: 2016-09-20 23:04
 */
public interface TargetAction {
    String buy(String ticket);
    void bringBack();
}
