package Arithmetic;
/*
 * 运用泽勒一致性计算某天是星期几？
 * 公式:
 *          h = (q + 26(m+1)/10 + k +k/4 + j/4 +5j) % 7
 * 其中：
 *
 * h是一个星期中每一天（0是星期六，1是星期天，2是星期一，3是星期二，4是星期三，5是星期四，6是星期五）
 * q是某月的天数
 * m是月份（3为三月，4为四月，……，12为十二月。其中一月和二月分别为上一年的13月和14月。）
 * j是世纪数，即year/100
 * k是世纪的年数，即year%100
 *
 */
import java.util.Scanner;
public class Xes {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        do{
            System.out.print("Enter a year: (e.g, 2012): ");

            int year = imput.nextInt();
            System.out.print("Enter a month: 1-12:  ");
            int month = imput.nextInt();
            System.out.print("Enter the day of the month: ");
            int day = imput.nextInt();
            switch (month) {
                case 1 -> {
                    month = 13;
                    year -= 1;
                }
                case 2 -> {
                    month = 14;
                    year -= 1;
                }
            }
            System.out.println(month);
            int century = year / 100;
            int yearOfCentury = year % 100;
            int theDayIs = (day + 26 * (month + 1) / 10 + yearOfCentury + yearOfCentury / 4 + century / 4 + 5 * century) % 7;
            switch (theDayIs) {
                case 0 -> System.out.println("Day of the week is Saturday");
                case 1 -> System.out.println("Day of the week is Sunday");
                case 2 -> System.out.println("Day of the week is Monday");
                case 3 -> System.out.println("Day of the week is Tuesday");
                case 4 -> System.out.println("Day of the week is Wednesday");
                case 5 -> System.out.println("Day of the week is Thursday");
                case 6 -> System.out.println("Day of the week is Friday");
            }
            System.out.println(" please input Enter");
            String k = imput.nextLine();
        }while(imput.hasNextLine());


    }
}