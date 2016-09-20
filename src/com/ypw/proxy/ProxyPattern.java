package com.ypw.proxy;

import com.ypw.proxy.proxyPattern.BuyTrainTicket;
import com.ypw.proxy.proxyPattern.ToBuyTrainTicket;
import com.ypw.proxy.proxyPattern.ToBuyTrainTicketProxy;

/**
 * @Description: TODO 填写功能描述
 * @author: hbwhypw
 * @date: 2016-09-20 22:38
 */
public class ProxyPattern {
    public static void main(String[] args) {
        BuyTrainTicket buyTrainTicket = new ToBuyTrainTicketProxy();

        buyTrainTicket.buy();
        System.out.println("----------------------");
        BuyTrainTicket buyTrainTicket1 = new ToBuyTrainTicket("我自己");
        buyTrainTicket1.buy();
    }
}
