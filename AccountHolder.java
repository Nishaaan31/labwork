
package AccountHolder;

  import java.util.Scanner;

  public class AccountHolder {
      
  static void checkAmount(double a) throws NegativeAmountException{
        if(a<0) throw new NegativeAmountException(a);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount;
        System.out.println("What do you want to do? \n1. Deposit\n2. Withdraw\nEnter your choice(1/2): ");
        int a = input.nextInt();
        if(a==1) {
            System.out.print("Enter your deposit amount: ");
            amount = input.nextDouble();
        }
        else {
            System.out.printf("Enter your withdraw amount: ");
            amount = input.nextDouble();
        }

        try{
            checkAmount(amount);
            System.out.println("Your Transaction is successful!");
        }
        catch (NegativeAmountException e){
            System.out.println(e);
            System.out.println("Please enter positive ammount");
        }

    }
}
