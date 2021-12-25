package com.inxianyu.xianyufordesignmodels.structural.AdapterPattern;

public class Transport {
    private ModeAdapter adapter=null;
    public String Mode(String audioMode,String logisticsName){
        if (audioMode.equalsIgnoreCase("c")){
            System.out.printf("%s公司使用的运输方式：%s%n",logisticsName,audioMode);
            return logisticsName+audioMode;
        }else if (audioMode.equalsIgnoreCase("a")||audioMode.equalsIgnoreCase("b")){
            adapter=new ModeAdapter(audioMode);
            adapter.Mode(audioMode,logisticsName);
            return "a||b";
        }else{
            System.out.printf("%s公司不支持运输方式为：%s类运输方式%n",logisticsName,audioMode);
            return "not support";
        }
    }
}
