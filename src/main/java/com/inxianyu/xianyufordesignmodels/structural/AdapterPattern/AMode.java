package com.inxianyu.xianyufordesignmodels.structural.AdapterPattern;

public class AMode implements OtherModes {
    @Override
    public void modeA(String UnableToTransport, String logisticsName) {
        if (logisticsName.equalsIgnoreCase("shunfeng")){
            System.out.printf("%s公司使用的运输方式：%s%n",logisticsName,UnableToTransport);
        }else{
            System.out.printf("%s公司不支持运输方式:%s类运输方式%n",logisticsName,UnableToTransport);
        }
    }
    @Override
    public void modeB(String UnableToTransport, String logisticsName) {
    }

}
