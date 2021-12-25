package com.inxianyu.xianyufordesignmodels.create.FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args){
            payfactory puyment = new payfactory();

            pay pay1 = payfactory.getpay("zhifubao");
            pay1.pay();

            pay pay2 = payfactory.getpay("OnlineBanking");
            pay2.pay();

            pay pay3 = payfactory.getpay("CreditCard");
            pay3.pay();
        }
    }

