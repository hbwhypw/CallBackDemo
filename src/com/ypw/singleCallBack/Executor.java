package com.ypw.singleCallBack;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-16 17:01
 */
public class Executor implements Callbackable {
    @Override
    public void execute() {
        System.out.println("Executor 回调执行中");
    }
}
