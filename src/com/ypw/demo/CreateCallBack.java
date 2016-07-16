package com.ypw.demo;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-07-12 20:40
 */
public class CreateCallBack<T> implements CallBackable<T> {

    private T param;
    public CreateCallBack(T param) {
        this.param = param;
    }

    @Override
    public void execute(T ts) {
        System.out.println(param.toString());
    }
}
