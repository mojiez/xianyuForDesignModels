package com.inxianyu.xianyufordesignmodels.structural.ProxyPattern;

public class Proxyimage implements image{
    private realimage realImage;
    private String fileName;

    public Proxyimage(String fileName){
        this.fileName=fileName;
    }

    @Override
    public void display() {
        if (realImage==null){
            realImage=new realimage(fileName);
        }
        realImage.display();
    }
}
