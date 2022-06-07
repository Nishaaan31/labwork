/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nishanslab1;
import java.util.Scanner;
public class NishansLab1 {
    

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
            System.out.println("Enter any 10 numbers: \n ");
            n1 =input.nextInt();
            n2 =input.nextInt();
            n3 =input.nextInt();
            n4 =input.nextInt();
            n5 =input.nextInt();
            n6 =input.nextInt();
            n7 =input.nextInt();
            n8 =input.nextInt();
            n9 =input.nextInt();
            n10 =input.nextInt();
            System.out.println("Result is : " +(n1+n2+n3+n4+n5-n6-n7-n8-n9-n10));
    }
    
}
