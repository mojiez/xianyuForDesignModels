package com.inxianyu.xianyufordesignmodels.behavioral.command;

import java.util.ArrayList;

public class AdminInvoker {
    //用户发布与取消的帖子id列表
    private ArrayList<RequestCommand> requests = new ArrayList<>();
    private ArrayList<RequestCommand> cancelRequests = new ArrayList<>();

    public void addRequest(RequestCommand request){
        requests.add(request);
        System.out.println("客户发布帖子id:"+request.postId);
    }

    public void delRequest(RequestCommand request){
        if (requests.remove(request)){
            cancelRequests.add(request);
            System.out.println("删除帖子"+request.postId+"成功");
        }else {
            System.out.println("没有找到帖子:"+request.postId);
        }
    }

    //通知执行
    public void notifyPublish(){
        for(RequestCommand request : requests){
            request.executeCommand();
        }
    }

    //通知取消
    public void notifyNotPublish(){
        for(RequestCommand request : cancelRequests){
            request.cancelCommand();
        }
    }
}
