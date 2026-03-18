package evennumberprinter;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class EvenNumberPrinter {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num=i.nextInt();
        int e=0;
        while (e<=num) {
            e++;
            if (e%2==0) {
                System.out.println(e);
            }
    }
    }
}
