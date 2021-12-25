package com.inxianyu.xianyufordesignmodels.structural.AdapterPattern;

public class ModeAdapter {
    private OtherModes othersmodes;
    public ModeAdapter(String UnableToTransport){
        if (UnableToTransport.equalsIgnoreCase("a")){
            othersmodes=new AMode();
        }else if (UnableToTransport.equalsIgnoreCase("b")){
            othersmodes=new BMode();
        }
    }
    public void Mode(String UnableToTransport,String logisticsName){
        if (UnableToTransport.equalsIgnoreCase("a")){
            othersmodes.modeA(UnableToTransport,logisticsName);
        }else if (UnableToTransport.equalsIgnoreCase("b")){
            othersmodes.modeB(UnableToTransport,logisticsName);
        }
    }
}
