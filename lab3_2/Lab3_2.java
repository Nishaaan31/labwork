
package lab3_2;

import java.util.Scanner;

public class Lab3_2 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter grade:");
        char grade;
        grade = input.next().charAt(0);
        switch (grade){
            case 'A' :
                System.out.println("range 90- 100");
                break;
                case 'B' :
                System.out.println("range 80 - 89 ");
                break;
                case 'C' :
                System.out.println("range 70 - 79");
                break;
                case 'D' :
                System.out.println("range 60 - 69 ");
                break;
                case 'F' :
                System.out.println("range 0 - 59");
                break;
                default :
                    System.out.println("Invalid");
                
        }
     
    }
    
}
