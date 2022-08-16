
package labday12;

public class ArrayOfObjects {

    public static void main(String[] args) {
         int size = 4;
         AccountHolder arrayOfAccounts[] = new AccountHolder[size];
         AccountHolder Mofiz = new AccountHolder(102, "Mofiz",1000);
         AccountHolder Kuddos = new AccountHolder(103, "Kuddos",1000);
         AccountHolder Abul = new AccountHolder(104, "Abul",1000);
        arrayOfAccounts[0] = Mofiz;
        arrayOfAccounts[1] = Kuddos;
        arrayOfAccounts[2] = Abul;
        
        System.out.println("elements of array are: ");
        for(int counter=0; counter<size; counter++)
        {
            System.out.println("arrayOfAccounts[counter]");
        }
        System.out.println("using for-each loop");
        for (AccountHolder a:arrayOfAccounts)
        {
            System.out.println(a);
        }
    }
    
}
