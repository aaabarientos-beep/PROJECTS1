package squarenumbers;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class Squarenumbers {
    public static void main(String[] args) {
       Scanner i=new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num=i.nextInt();
       int s=1;
       while(s<=num) {
           System.out.println(s*s);
           s++;
       }
    }
}
