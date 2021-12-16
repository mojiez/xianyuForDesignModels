package com.inxianyu.xianyufordesignmodels.behavioral.command;

public abstract class RequestCommand {
    public HandleReceiver handle; //指令的执行者
    public String postId;
    public RequestCommand(HandleReceiver handle,String postId){
        this.handle = handle;
        this.postId = postId;
    }
    abstract public void executeCommand();
    abstract public void cancelCommand();
}
