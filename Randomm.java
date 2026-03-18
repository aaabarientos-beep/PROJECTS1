/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomm;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author abari
 */
public class Randomm {

    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        Scanner p=new Scanner(System.in);
        Random ran=new Random();
        String c=" ";
        do{ 
        System.out.print("ENTER NUMBER FROM 1-10: ");
        int n=i.nextInt();
        int r=ran.nextInt(11);
        System.out.println("RANDOM NUMBER: "+r);
        if(n==r) {
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("YOU LOSE");
        }
        System.out.print("Do you wish to continue [Y/N]: ");
        c=p.nextLine();
    } while (c.equals("Y"));
    }
}
