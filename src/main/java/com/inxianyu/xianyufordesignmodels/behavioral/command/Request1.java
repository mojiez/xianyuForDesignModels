package com.inxianyu.xianyufordesignmodels.behavioral.command;

public class Request1 extends RequestCommand{
    public Request1(HandleReceiver handle,String postId){
        super(handle,postId);
    }
    @Override
    public void executeCommand() {
        handle.publishing(postId);
    }

    @Override
    public void cancelCommand() {
        handle.notpublishing(postId);
    }
}
