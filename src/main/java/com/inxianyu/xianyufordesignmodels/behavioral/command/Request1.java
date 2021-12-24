package com.inxianyu.xianyufordesignmodels.behavioral.command;

public class Request1 extends RequestCommand{
    public Request1(HandleReceiver handle,String postId){
        super(handle,postId);
    }
    @Override
    public String executeCommand() {
        return handle.publishing(postId);
    }

    @Override
    public String cancelCommand() {
        return handle.notpublishing(postId);
    }
}
