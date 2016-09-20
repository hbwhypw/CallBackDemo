package com.ypw.proxy.proxyPattern;

/**
 * @Description: 代理购票
 * @author: hbwhypw
 * @date: 2016-09-20 22:45
 */
public class ToBuyTrainTicketProxy implements BuyTrainTicket {

    /**
     * 要去购买火车票的人
     */
    private ToBuyTrainTicket toBuyTrainTicketer;

    /**
     *
     */
    @Override
    public void buy() {
        if (toBuyTrainTicketer == null) {
            toBuyTrainTicketer = new ToBuyTrainTicket("代理人");
        }
        payProxyFee();
        toBuyTrainTicketer.buy();
        bringTrainTicket();
    }

    public void payProxyFee() {
        System.out.println("支付代理费");
    }

    public void bringTrainTicket() {
        System.out.println("取回火车票");
    }
}
