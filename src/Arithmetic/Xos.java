package Arithmetic;

import java.util.Scanner;

/**
 * &#064;program: Xos
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-21 10:45
 **/
public class Xos {
    public static void main(String[] args) {
        while (true) {
            Scanner d = new Scanner(System.in);
            System.out.println("请输入消费金额：");
            if (d.hasNextInt()) {
                int w = d.nextInt();
                System.out.println("是否参加优惠换购活动：\n1：满50元，加2元换购百事可乐饮料1瓶\n2：满100元，加3元换购500ml可乐一瓶\n3：满100元，加10元换购5公斤面粉\n4：满200元，加10元可换购1个苏波尔炒菜锅\n5:满200元，加20元可换购欧莱雅爽肤水一瓶\n0:不换购\n请换购：");
                int e = d.nextInt();
                switch (e) {
                    case 1 -> System.out.println("本次消费总金额：" + (w + 2) + "\n成功换购：百事可乐饮料一瓶。");
                    case 2 -> System.out.println("本次消费总金额：" + (w + 3) + "\n成功换购：500ml可乐一瓶。");
                    case 3 -> System.out.println("本次消费总金额：" + (w + 10) + "\n成功换购：5公斤面粉。");
                    case 4 -> System.out.println("本次消费总金额：" + (w + 10) + "\n成功换购：1个苏波尔炒菜锅。");
                    case 5 -> System.out.println("本次消费总金额：" + (w + 20) + "\n欧莱雅爽肤水一瓶。");
                    case 0 -> System.out.println("本次消费总金额：" + w + "\n");
                    default -> {
                        System.out.println("本次消费总金额：" + w);
                    }
                }
            }else{
                System.out.println("输入错误！");
            }
        }
    }
}
