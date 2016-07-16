package com.ypw.MutiCallBack;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-16 17:21
 */
public class KnownExecutor implements Callbackable {
    @Override
    public void execute() {
        System.out.println("我已经知道我要做什么");
    }
}
