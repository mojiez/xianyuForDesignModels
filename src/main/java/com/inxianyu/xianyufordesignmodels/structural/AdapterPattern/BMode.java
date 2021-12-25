package com.inxianyu.xianyufordesignmodels.structural.AdapterPattern;

public class BMode implements OtherModes {

    @Override
    public void modeA(String UnableToTransport, String logisticsName) {

    }

    @Override
    public void modeB(String UnableToTransport, String logisticsName) {
        if (logisticsName.equalsIgnoreCase("yunda")){
            System.out.printf("%s公司使用的运输方式：%s%n",logisticsName,UnableToTransport);
        }else{
            System.out.printf("%s公司不支持运输方式:%s类运输方式%n",logisticsName,UnableToTransport);
        }
    }
}
