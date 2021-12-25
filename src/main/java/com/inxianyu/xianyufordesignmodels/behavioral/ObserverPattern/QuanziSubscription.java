package com.inxianyu.xianyufordesignmodels.behavioral.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class QuanziSubscription {
    private List<observer> users=new ArrayList<observer>();
    private String news;

    public void updateNews(String news){
        this.news=news;
        System.out.printf("圈子更新了内容：%s%n",news);
        notifyUsers();
    }
    public String getNews(){
        return news;
    }
    public void attach(observer user){
        users.add(user);
    }
    public void detach(observer user){
        if (!users.remove(user)){
            System.out.println("不可删除该不存在用户！");
        }
    }
    public void notifyUsers(){
        for (observer user:users){
            user.update();
        }
    }
}
