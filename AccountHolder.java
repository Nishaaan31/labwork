
package labday12;

public class AccountHolder {
   private int acc_num;
   private int balance;
   private String name;
   
   AccountHolder()
   {
   balance =0;
   acc_num = 0;
   name = null;
   
   }
   AccountHolder(int acc_num, String name, int balnce){
   this.acc_num = acc_num;
   this.name = name;
   this.balance = balance;
   }

    public int getAcc_num() {
        return acc_num;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   public void checkbalance()
   {
       System.out.println("Your balance is: "+balance);
   }
   public void deposite(int dep_ammount)
   {
       balance = balance + dep_ammount;
       System.out.println("Deposite completed ");
   }
   public void withdraw(int with_ammount)
   {
   if(balance>with_ammount)
   {
   balance = balance - with_ammount;
       System.out.println("withdraw successfull");
   }
   else
           System.out.println("Insufficiant balance");
   }
   public String toString()
   {
       return "toString method "+name + " "+ acc_num + " "+balance;
   }
}
