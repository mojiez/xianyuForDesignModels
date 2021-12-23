package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

public class groupAdminDecorator extends memberDecorator{
    private int id;
    //管理员标记

    public groupAdminDecorator(groupMember groupmember,int id) {
        super(groupmember);
        this.id = id;
    }

    @Override
    public boolean sendMessage(String message) {
        withMark();
        return groupmember.sendMessage(message);
    }

    private void withMark(){
        System.out.println("管理员的id为:"+id);
    }

    private void deleteMember(){
        System.out.println("删除了一位成员..");
    }

    private void addMember(){
        System.out.println("添加了一位成员..");
    }
}
