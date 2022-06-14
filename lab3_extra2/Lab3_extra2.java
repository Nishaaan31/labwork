
package lab3_extra2;

import java.util.Scanner;

public class Lab3_extra2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year:");
        int Year;
        Year = input.nextInt();
        if(Year%4==0 && Year%400!=0 && Year%100!=0 ){
         System.out.println("leap year");
        }
         else {
                  System.out.println("not a year:");
                 }
    }
        
    }
    
