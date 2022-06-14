
package lab3_3;

import java.util.Scanner;

public class Lab3_3 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any day: ");
        num = input.nextInt();
        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays ");
                break;
            case 6:
            case 7:
                System.out.println("Weekends ");
                break;
                default :
                    System.out.println("Invalid");
                
    }
    
}
}
