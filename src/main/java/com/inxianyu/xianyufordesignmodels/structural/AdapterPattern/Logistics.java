package com.inxianyu.xianyufordesignmodels.structural.AdapterPattern;

import sun.audio.AudioPlayer;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String logistics=null;
        String logisticsName=null;
        String audioMode=null;
        Transport player=null;
        while(input.hasNext()){
            logistics= input.nextLine();
            if (!logistics.equals("end")){
                logisticsName=logistics.substring(0,logistics.indexOf('.'));
                audioMode=logistics.substring(logistics.indexOf('.')+1);
                player=new Transport();
                player.Mode(audioMode,logisticsName);
            }else{
                break;
            }
        }
        input.close();
    }
}
