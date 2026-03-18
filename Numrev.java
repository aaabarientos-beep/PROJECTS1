
package com.mycompany.numrev;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class Numrev {

    public static void main(String[] args) {
       Scanner i=new Scanner(System.in);
       int []num=new int[6];
       for(int j=0;j<6;j++) {
           System.out.print("Num "+(j+1)+": ");
           num[j]=i.nextInt();
       }
       System.out.println("REVERSED ORDER");
       for(int j=5;j>=0;j--) {
           System.out.print(num[j]+" ");
       }
    }            
}
