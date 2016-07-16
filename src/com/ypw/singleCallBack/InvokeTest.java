package com.ypw.singleCallBack;

/**
 * @Description: TODO 调用测试
 * @author: hbwhypw
 * @date: 2016-07-16 17:06
 */
public class InvokeTest {
    public static void main(String[] args) {
        Caller caller = new Caller(new Executor());
        caller.call();

        Caller caller1 = new Caller(new Executor(){
            @Override
            public void execute() {
                System.out.println("重写的Executor 回调执行中");
            }
        });
        caller1.call();
    }
}
