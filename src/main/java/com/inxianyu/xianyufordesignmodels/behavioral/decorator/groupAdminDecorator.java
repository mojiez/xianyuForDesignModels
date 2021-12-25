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

    private String withMark(){
        System.out.println("管理员的id为:"+id);
        return "管理员的id为:"+id;
    }

    private String deleteMember(){
        System.out.println("删除了一位成员..");
        return "删除了一位成员..";
    }

    private String addMember(){
        System.out.println("添加了一位成员..");
        return "添加了一位成员..";
    }

    public String TestWithMark(){
        return withMark();
    }

    public String TestDelete(){
        return  deleteMember();
    }
    public String TestAdd(){
        return addMember();
    }
}
