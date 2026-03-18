
package com.mycompany.minigrocery;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class MINIGROCERY {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Scanner i=new Scanner(System.in);
       String []item=new String [50];
       int []p=new int[50];
       int []q=new int[50];
       int []total=new int [50];
       int ctr=1;
       boolean stop=false;
       String c=" ";
        for(int j=0;j<50;j++) {
           System.out.print("ENTER ITEM NAME: ");
           item[0]=sc.nextLine();
           System.out.print("ENTER ITEM PRICE: ");
           p[0]=sc.nextInt();
           System.out.print("ENTER ITEM QTY: ");
           q[0]=sc.nextInt();
           System.out.print("DO YOU WISH TO ADD ANOTHER ITEM [Y/N]: ");
           c=i.nextLine();
        if(c.equals("Y")) {
            continue;
        }
        else {
            break;
        }
        }
       System.out.println("ITEM NAME    QTY     COST    TOTAL");
       for(int j=0;j<ctr;j++) {
           System.out.println(item[j]+"   "+q[j]+"    "+total[j]);
       }
 }
}