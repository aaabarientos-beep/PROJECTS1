
package com.mycompany.large;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class Large {

    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        int []num=new int[10];
        int large=0;
        
        System.out.println("ENTER 10 INTEGERS");
        for(int n=0;n<10;n++) {
            System.out.print("Num "+(n+1)+": ");
            num[n]=i.nextInt();
            if(num[n]>large) {
                large=num[n];
            }
        }
        System.out.println("Largest Number is: "+large);
    }
}
