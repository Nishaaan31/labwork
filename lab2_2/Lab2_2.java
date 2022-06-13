/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_2;

import java.util.Scanner;


public class Lab2_2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,n3;
        n1 =input.nextInt();
        n2 =input.nextInt();
        n3 =input.nextInt();
        
        if(n1 > n2 && n2 > n3){
            System.out.println(" The Largest number is : "+n1);
        }
        else if(n2 > n3 && n2 > n1 ) {
            System.out.println("The Largest Number is: "+n2);
            }
        else if (n3 > n2 && n3 > n1){
            System.out.println("The Largest Number is: "+n3);
        }
        else {
       System.out.println("The nmuber is equal" );
    }
    
    }
}
