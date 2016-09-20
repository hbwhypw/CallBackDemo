package com.ypw.proxy.proxyPattern;

/**
 * @Description: 实际购买者
 * @author: hbwhypw
 * @date: 2016-09-20 22:42
 */
public class ToBuyTrainTicket implements BuyTrainTicket {

    private String username;

    public ToBuyTrainTicket() {
    }

    public ToBuyTrainTicket(String username) {
        this.username = username;
    }


    @Override
    public void buy() {
        System.out.println(username + " 去实际购买动作");
    }
}
