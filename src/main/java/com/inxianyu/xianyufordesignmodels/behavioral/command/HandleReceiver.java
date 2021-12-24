package com.inxianyu.xianyufordesignmodels.behavioral.command;

public abstract class HandleReceiver {
    public String groupName;
    public HandleReceiver(String groupName){
        this.groupName = groupName;
    }
    abstract public String publishing(String postId);
    abstract public String notpublishing(String postId);
}
