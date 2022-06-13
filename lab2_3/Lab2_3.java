/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_3;

import java.util.Scanner;

public class Lab2_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1,n2,n3,r,area1,area2;
        n1 =input.nextDouble();
        n2 =input.nextDouble();
        n3 =input.nextDouble();
      
        if(n1 > n2 && n2 > n3){
            r = n1;
            area1 = 3.1416 * r * r;
            System.out.println(" Area of first circle is : "+area1);
        }
        else if(n2 > n3 && n2 > n1 ) {
            r = n2;
            area1 = 3.1416 * r * r;
            System.out.println(" area of first circle is: "+area1);
            }
        else {
            r = n3;
            area1 = 3.1416 * r * r;
            System.out.println("Area of first circle is: "+area1);
        }
        if(n1 < n2 && n1 < n3) {
            r = n1;
            area2 = 3.1416 * r * r;
            System.out.println(" Area of last circle is : "+area2);
       
    }
        else if(n2 < n3 && n2 < n1){
             r = n2;
            area2 = 3.1416 * r * r;
            System.out.println(" Area of last circle is : "+area2);
        }
        else {
             r = n3;
            area2 = 3.1416 * r * r;
            System.out.println(" Area of last circle is : "+area2);
        }
        System.out.println(" Area of circle is : "+(area1-area2));
    }
    
}
