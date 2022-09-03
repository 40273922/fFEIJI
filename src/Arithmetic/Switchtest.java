package Arithmetic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * &#064;program: Switch
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-21 08:39
 **/
public class Switchtest {
    public static void main(String[] args) {
        try {
        while (true) {
            try {
                System.out.println("1.登陆系统\n2.退出\n*********************");
                Scanner s = new Scanner(System.in);
                System.out.println("请输入选择，输入数字：");
                if(s.hasNextInt()){
                int i = s.nextInt();
                switch (i) {
                    case 1 -> {
                        System.out.println("登陆系统>\n1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销\n请输入选择，输入数字：");
                        if(s.hasNextInt()){
                        int w = s.nextInt();
                        switch (w) {
                            case 1 -> System.out.println("登陆系统>购物管理系统>客户信息管理\n1.显示所有用户信息\n2.添加客户信息\n3.修改客户信息\n4.查询客户信息");
                            case 3 -> System.out.println("购物管理系统>真情回馈\n1.幸运大放送\n2.幸运抽奖\n3.生日问候");
                            default -> {
                            }
                        }
                        }else {
                            System.out.println("非法输入");
                        }
                    }
                    case 2 -> System.out.println("已退出");
                    default -> {
                    }
                }
                }else {
                    System.out.println("非法输入");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("非法输入");
            }
        }
    }catch (Exception e){
            e.printStackTrace();
        }
    }

}
