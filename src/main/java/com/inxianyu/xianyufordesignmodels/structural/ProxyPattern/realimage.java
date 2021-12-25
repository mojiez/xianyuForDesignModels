package com.inxianyu.xianyufordesignmodels.structural.ProxyPattern;

public class realimage implements  image{
    private  String fileName;

    public realimage(String fileName){
        this.fileName=fileName;
        loadFromDisk();

    }

    @Override
    public String display() {
        System.out.printf("显示文件：%s%n",fileName);
        return fileName;
    }

    private void loadFromDisk() {
        System.out.printf("正在从磁盘加载文件：%s%n",fileName);
    }
}
