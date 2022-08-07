
package labday10;

public class Rectangle extends Shape{
    private double side1;
    private double side2;

    Rectangle(String name, double s1, double s2)
    {
        super(name);
        side1 = s1;
        side2 = s2;
    }
    public void setSide1(double side1) 
    {
        this.side1 = side1;
    }
    public void setSide2(double side2) 
    {
        this.side2 = side2;
    }
    public double getSide1()
    {
        return side1;
    }
    public double getSide2() 
    {
        return side2;
    }
    public double area()
    {
        return side1*side2;
    }
    public double perimeter()
    {
        return 2*(side1 + side2);
    }
}
