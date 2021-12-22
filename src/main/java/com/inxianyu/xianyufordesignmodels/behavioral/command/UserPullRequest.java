package com.inxianyu.xianyufordesignmodels.behavioral.command;


public class UserPullRequest {
    public static void main(String[] args) {
        //初始化圈子

        HandleReceiver handle1 = new Group1("groupName");
        //初始化 可发布的评论
        RequestCommand request1 = new Request1(handle1,"postId");
        //Admin通知发布评论
        AdminInvoker admin = new AdminInvoker();
        admin.addRequest(request1);
        //Admin通知圈子进行发布
        admin.notifyPublish();
        //Admin修改
        admin.delRequest(request1);
        //Admin通知圈子取消评论
        admin.notifyNotPublish();
    }
}
