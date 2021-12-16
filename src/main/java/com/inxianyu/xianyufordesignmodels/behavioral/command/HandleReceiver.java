package com.inxianyu.xianyufordesignmodels.behavioral.command;

public abstract class HandleReceiver {
    public String groupName;
    public HandleReceiver(String groupName){
        this.groupName = groupName;
    }
    abstract public void publishing(String postId);
    abstract public void notpublishing(String postId);
}
