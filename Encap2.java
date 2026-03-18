
package encap2;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class Encap2 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        Encaps2 en=new Encaps2();
        System.out.print("Enter your deposit: ");
        double d=i.nextDouble();
        en.setDeposit(d);
        System.out.print("Enter the amount of withdrawal: ");
        double w=i.nextDouble();
        en.setWithdraw(w);
        if (w<=d) {
        System.out.println("Remaining Balance: "+en.getBalance());
        }
    }
}
