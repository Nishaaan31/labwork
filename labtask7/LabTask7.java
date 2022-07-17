package labtask7;

public class LabTask7 {

        double radius;
        public LabTask7()
        {
          radius = 0;
        }
         public LabTask7(int rad)
        {
          radius = rad;
        }
        public void findArea(double r){
            double area = 3.1416*r*r;
            System.out.println("The area is: "+area);
           }
        public double findCircumference(double r){
            double circum =2*3.1416*r;
            return circum;
                    
        }
    
}
