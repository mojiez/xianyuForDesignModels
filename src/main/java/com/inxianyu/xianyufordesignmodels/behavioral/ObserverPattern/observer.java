package com.inxianyu.xianyufordesignmodels.behavioral.ObserverPattern;

public abstract class observer {
    public WechatSubscription subscriptAccount;
    public String name;

    abstract public void update();
}
