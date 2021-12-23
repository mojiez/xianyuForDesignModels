package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

public interface groupMember {
    boolean sendMessage(String message);
    boolean quitGroup();
    boolean getMessage(String message);
}
