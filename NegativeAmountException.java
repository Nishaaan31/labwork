
package AccountHolder;

public class NegativeAmountException extends Exception{
    
    private final double amount;
    public NegativeAmountException(double amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "NegativeAmountException: "+amount;
    }
}

