
package labwork3;

import java.util.Scanner;

public class LabWork3 {

    public static void main(String[] args) {
        System.out.println("Enter a month:");
        Scanner input = new Scanner(System.in);
        int Monthnumber;
        Monthnumber = input.nextInt();
        System.out.println("input: ");
        switch (Monthnumber){
            case 1 :
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5 :
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
                
            default :
                System.out.println("Invalid");
        }
    }
    
}
