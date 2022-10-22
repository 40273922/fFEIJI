/**
 * &#064;program: Demop1
 * <p>
 * &#064;description:
 * <p>
 * &#064;author:XieMu
 * <p>
 * &#064;create: -10-23 16:16
 **/
public class Demop1 {
    public static void main(String[] args) {
        for(int i =1;i<=4;i++){
            for(int k=1;k<=4-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i-1)*2+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
