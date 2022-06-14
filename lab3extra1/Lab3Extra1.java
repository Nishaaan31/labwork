
package lab3extra1;

import java.util.Scanner;

public class Lab3Extra1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        for (int i=2; i<num; i++ ){
            if(num % 2 == 0){
                System.out.println("This is not a prime number");
                break;
            }
            else{
               System.out.println("This is a prime number");
                break; 
            }
    }
    
}
}
