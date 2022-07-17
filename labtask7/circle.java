
package labtask7;

public class circle {
    public static void main(String[] args) {
        
         LabTask7 c1 = new LabTask7();
         System.out.println("The radius of first radius: "+c1.radius);
         c1.findArea(2);
         
         double circumfer = c1.findCircumference(2);
         System.out.println("Circumference is "+circumfer);
         
          LabTask7 c2 = new LabTask7(5);
         System.out.println("The radius of second radius: "+c1.radius);
    }
    
}
