
package labday10;

public class MainClass {

    public static void main(String[] args) 
    {
        Square s = new Square("Square",12,12);
        
        System.out.println("Area: "+s.area());
        
        System.out.println("Perimeter: "+s.perimeter());
    }
}
