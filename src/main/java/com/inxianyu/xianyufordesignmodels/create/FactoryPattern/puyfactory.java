package com.inxianyu.xianyufordesignmodels.create.FactoryPattern;

public class puyfactory {
    public static puy getpuy(String payment){
        if(payment==null){
            return null;
        }
        if (payment.equalsIgnoreCase("zhifubao")){
            return new zhifubao();
        }else if (payment.equalsIgnoreCase("OnlineBanking")) {
            return new OnlineBanking();
        }else if (payment.equalsIgnoreCase("CreditCard")) {
            return new CreditCard();
        }
        return null;
    }
}


