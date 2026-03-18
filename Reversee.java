/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversee;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class Reversee {

    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        char[] name=new char [50];
        int length=0;
        System.out.print("Enter your name: ");
        String namee=i.nextLine();
        for(int n=0;n<namee.length();n++) {
            name[n]=namee.charAt(n);
            length++;
        }
        for(int j=length-1;j>=0;j--) {
            System.out.print(name[j]);
        }
    }
}
