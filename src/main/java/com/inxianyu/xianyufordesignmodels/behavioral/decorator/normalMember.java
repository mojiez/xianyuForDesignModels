package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

public class normalMember implements groupMember{
    @Override
    public boolean sendMessage(String message) {
        System.out.println(message+" 发送成功！");
        return true;
    }

    @Override
    public boolean quitGroup() {
        System.out.println("退出成功！！！");
        return true;
    }

    @Override
    public boolean getMessage(String message) {
        System.out.println("获取信息："+ message);
        return true;
    }
}
