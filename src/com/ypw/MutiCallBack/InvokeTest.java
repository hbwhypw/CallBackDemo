package com.ypw.MutiCallBack;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-16 17:22
 */
public class InvokeTest {
    public static void main(String[] args) {
        Caller caller = new Caller();
        caller.register(new KnownExecutor());
        caller.register(new UnknownExecutor() {
            @Override
            public void execute() {
                System.out.println("我刚知道我要做什么");
            }
        });
        caller.register(new UnknownExecutor() {
            @Override
            public void execute() {
                System.out.println("我再做点什么");
            }
        });
        caller.call();
    }
}
