/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayy;

import java.util.Scanner;

/**
 *
 * @author abari
 */
public class Arrayy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner i=new Scanner(System.in);
    int [] num=new int[10];
    for (int a=0;a<=10;a++) {
    System.out.print("Enter a room number: ");
    num[a]=i.nextInt();
    if (num[a]!=8) {
        System.out.println("Successfull yey");
    }
    if (num[a]==8) {
        System.out.println("Occupied awit");
    }
    }

    }
    
}
