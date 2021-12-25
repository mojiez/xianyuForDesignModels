package com.inxianyu.xianyufordesignmodels.structural.ProxyPattern;

public class checkimage {
    public static void main(String[] args){
        image Image = new Proxyimage("test.txt");

        System.out.println("第一次访问文件");
        Image.display();

        System.out.println("*******");

        System.out.println("第二次访问文件");
        Image.display();
    }
}
