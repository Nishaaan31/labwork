
package labtask6;

import java.util.Scanner;

public class LabTask6 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("enter four values: ");
        int a,b,m,n;
        a = input.nextInt();
        b = input.nextInt();
        m = input.nextInt();
        n = input.nextInt();
       Smallest(a,b,m,n) ;
}
    public static void Smallest(int a,int b, int m, int n){
        if(a<b && a<m && a<n)
            System.out.println(a+ "is the smallest");
        else if( b<m && b<n)
                System.out.println(b+ "is the smallest");
        else if(m<a)
                System.out.println(m+ "is the smallest");
        else if(n<a && n<b && n<m )
                System.out.println(n+ "is the smallest");
        else
            System.out.println("numbers are equal");
    }
}