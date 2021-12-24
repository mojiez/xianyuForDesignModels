package com.inxianyu.xianyufordesignmodels.behavioral.command;

public class Group1 extends HandleReceiver{
    public Group1(String groupName){
        super(groupName);
    }
    @Override
    public String publishing(String postId) {
        System.out.println(groupName+"正在发布"+postId);
        return groupName+"正在发布"+postId;
    }

    @Override
    public String notpublishing(String postId) {
        System.out.println(groupName+"取消发布"+postId);
        return groupName+"取消发布"+postId;
    }
}
