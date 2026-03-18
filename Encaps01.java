package encaps01;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class Encaps01 {
    public static void main(String[] args) {
       Scanner i=new Scanner(System.in);
        int myCash=500, myBet, myColor;
        System.out.println("Your initial cash is: 500");
        System.out.print("0 is Red\n1 is Yellow\n2 is Blue\n3 is Green\n4 is Pink\n5 is White\nChoose your color: ");
        myColor=i.nextInt();
        System.out.print("Enter your bet: ");
        myBet=i.nextInt();
        processClass pc=new processClass(myCash);
        int upc=pc.getyC(myColor, myBet);
         if (pc.dyw) {
             System.out.println("Congratulations! You Won!!!");
         } else {
             System.out.println("Sorryy, you lost 🙁");
         }
         System.out.println("Your new cash balance: " +upc);
    }
    
}
