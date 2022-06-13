/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nishanslab2;

import java.util.Scanner;


public class NishansLab2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num =input.nextInt();
        if(num > 0){
            System.out.println("Number is positive");
        }
        else if(num < 0) {
            System.out.println("Number is Negative");
            }
        else {
            System.out.println("Zero");
        }
    }
}
