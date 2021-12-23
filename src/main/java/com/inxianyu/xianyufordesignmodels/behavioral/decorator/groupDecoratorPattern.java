package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

public class groupDecoratorPattern {
    public static void main(String[] args) {
        groupMember groupmember = new normalMember();

        //一位普通群成员执行命令
        groupmember.sendMessage("A normal member send a message..");
        groupmember.getMessage("A normal member get a message");
        System.out.println("***************");
        System.out.println("该成员升级为管理员");
        groupmember = new groupAdminDecorator(groupmember,1);
        groupmember.sendMessage("该消息为管理员发送");
        System.out.println("***************");

    }
}
