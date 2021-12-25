package com.inxianyu.xianyufordesignmodels;

import com.inxianyu.xianyufordesignmodels.behavioral.decorator.groupMember;
import com.inxianyu.xianyufordesignmodels.behavioral.decorator.normalMember;
import com.inxianyu.xianyufordesignmodels.behavioral.strategy.Seller;
import com.inxianyu.xianyufordesignmodels.behavioral.strategy.moreStrategy;
import com.inxianyu.xianyufordesignmodels.*;
import com.inxianyu.xianyufordesignmodels.create.BuilderPattern.ShoppingCart;
import com.inxianyu.xianyufordesignmodels.create.BuilderPattern.ShoppingCartBuilder;
import com.inxianyu.xianyufordesignmodels.create.FactoryPattern.pay;
import com.inxianyu.xianyufordesignmodels.create.FactoryPattern.payfactory;
import com.inxianyu.xianyufordesignmodels.structural.ProxyPattern.Proxyimage;
import com.inxianyu.xianyufordesignmodels.structural.ProxyPattern.image;
import com.inxianyu.xianyufordesignmodels.structural.bridge.agesin40;
import com.inxianyu.xianyufordesignmodels.structural.bridge.usersMoney;
import com.inxianyu.xianyufordesignmodels.structural.bridge.usersMoneyIsHigh;

import java.util.Scanner;

public class UserInXianyu {
    private Scanner input = new Scanner(System.in);
    private int payMethods;
    private int CanDoChoice;

    public UserInXianyu(){
        showWhatCanUserDo();
        getUserCanDoInput();
    }

    private void showWhatCanUserDo(){
        System.out.println("请输入你要选择的功能:(按-1退出)");
        System.out.println("1. 商品发布\n2. 接收推送\n3. 结算购物车\n4. 发布评论\n5.查看图片");

    }

    private void getUserCanDoInput(){
        while ((CanDoChoice = input.nextInt())!=-1){
            if (CanDoChoice==1){
                Seller seller1 = new Seller();
                System.out.println("检测到您的信用值为100，交易数量为10，为您匹配最多人推广策略...");
                moreStrategy moreStrategy = new moreStrategy();
                seller1.sell(100,10,moreStrategy);
            } else if (CanDoChoice==2){
                System.out.println("(系统检测该用户年龄段与收入..)");
                System.out.println("(检测用户20-40年龄段,高收入人群)");
                usersMoney method = new usersMoneyIsHigh(new agesin40());
                method.recommend();
                System.out.println("接收推送成功..");
            }else if (CanDoChoice==3){
                ShoppingCartBuilder shoppingCartBuilder = new ShoppingCartBuilder();
                ShoppingCart Lining = shoppingCartBuilder.LiNing();
                Lining.showItems();
                ShoppingCart adidas = shoppingCartBuilder.Adidas();
                adidas.showItems();

                System.out.println("Total Cost:"+adidas.getCost());
                System.out.println("\n请选择付款方式:\n1. alipay\n2. onlineBanking\n2.CreditCard");
                payment();
            }else if (CanDoChoice == 4){
                pinglun();
            }else if (CanDoChoice == 5){
                image Image = new Proxyimage("goods.png");
                Image.display();
            }else if (CanDoChoice == -1){
                break;
            }else {
                System.out.println("invalid input!");
            }

        }
    }

    private void pinglun(){
        groupMember groupmember = new normalMember();
        System.out.println("输入评论:\n");
        String msg = input.next();
        groupmember.sendMessage(msg);
    }
    private void payment(){
        payMethods = input.nextInt();
        payfactory payment = new payfactory();
        try {
            if (payMethods == 1){
                pay zhifubao = payfactory.getpay("zhifubao");
                zhifubao.pay();
            }else if (payMethods == 2){
                pay onlineBanking = payfactory.getpay("OnlineBanking");
                onlineBanking.pay();
            }else if (payMethods == 3){
                pay creditCard = payfactory.getpay("CreditCard");
                creditCard.pay();
            }
        }catch (Exception e){
            System.out.println("你输入的支付方式不合法");
        }
    }
}
