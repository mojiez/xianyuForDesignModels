package com.inxianyu.xianyufordesignmodels.create.FactoryPattern;

public class FactoryDemo {
    public static void main(String[] args){
            puyfactory puyment = new puyfactory();

            puy puy1 = puyfactory.getpuy("zhifubao");
            puy1.puy();

            puy puy2 = puyfactory.getpuy("OnlineBanking");
            puy2.puy();

            puy puy3 = puyfactory.getpuy("CreditCard");
            puy3.puy();
        }
    }

