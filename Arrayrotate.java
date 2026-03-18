
package com.mycompany.arrayrotate;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class Arrayrotate {

    public static void main(String[] args) {
       Scanner i=new Scanner(System.in);
       int[]num=new int[5];
       System.out.println("INPUT 5 NUMBERS");
       for(int j=0;j<5;j++) {
           System.out.print("Num "+(j+1)+": ");
           num[j]=i.nextInt();
       }
       int last=num[4];
       for(int j=4;j>0;j--) {
           num[j]=num[j-1];
    }
       num[0]=last;
       for(int j=0;j<num.length;j++) {
           System.out.print(num[j]+" ");
       }
    }
}
