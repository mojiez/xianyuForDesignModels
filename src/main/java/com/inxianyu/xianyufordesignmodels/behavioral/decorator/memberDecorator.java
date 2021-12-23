package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

public abstract class memberDecorator implements groupMember{
    public groupMember groupmember;
    public memberDecorator(groupMember groupmember){
        this.groupmember = groupmember;
    }

    @Override
    public boolean sendMessage(String message) {
        return groupmember.sendMessage(message);
    }

    @Override
    public boolean quitGroup() {
        return groupmember.quitGroup();
    }

    @Override
    public boolean getMessage(String message) {
        return groupmember.getMessage(message);
    }
    

}
