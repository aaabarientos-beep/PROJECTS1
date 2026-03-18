package digit.count;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class DigitCount {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num=i.nextInt();
        int ctr=0;
        while(num!=0) {
            num/=10;
            ctr++;
        }
        System.out.println("Number of digits: "+ctr);
    }
    
}
