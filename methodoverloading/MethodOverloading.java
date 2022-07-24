package methodoverloading;
public class MethodOverloading {
    public static void main(String[] arg){ 
      add(1,2);   
      add(3,4,5);
      add(5,15,25,10);
      add(2.5,3.5);
      add(7,4.0);
      add(4.5,10);
    }
    public static void add(int n1,int n2){
       int summation = n1+n2;
        System.out.println("summation1 : "+summation);
    }
     public static void add(int n1,int n2,int n3){
       int summation = n1+n2+n3; 
       System.out.println("summation2 : "+summation);
    }
    public static void add(int n1,int n2,int n3, int n4){
         int summation = n1+n2+n3+n4;
         System.out.println("summation3 : "+summation);
    }
    public static void add(double n1, double n2){
        double summation = n1+n2;
        System.out.println("summation4 : "+summation);
        
    }    
     public static void add(int n1, double n2){
         double summation =n1+n2;
         System.out.println("summation5 : "+summation);
     }
      public static void add(double n2,int n1){
        double summation =n1+n2;
         System.out.println("summation6 : "+summation);   
      }
}
