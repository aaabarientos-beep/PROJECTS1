package sumofdigits;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class SumofDigits {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
    int [] num=new int[10];
    for (int a=0;a<=10;a++) {
    System.out.print("Enter a room number: ");
    num[a]=i.nextInt();
    if (num[a]==8) {
        System.out.print("Occupied awit");
    }
    }
    }
}
    

