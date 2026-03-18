package pkgwhile.loop.counting;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class WhileLoopCounting {
    public static void main(String[] args) {
       Scanner i=new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num=i.nextInt();
       int ctr=0;
       while (ctr<=num) {
           System.out.println(ctr);
           ctr++;
       }
    }
}
