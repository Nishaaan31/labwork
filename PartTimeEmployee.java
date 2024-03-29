
package labtask11;

public class PartTimeEmployee extends Employee {
    
    private double hours;
    private double rate;

    public PartTimeEmployee(String name, int age, String address,String department, String designation,double hours, double rate) {
        super(name,age,address,department,designation);
        this.hours = hours;
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    
    @Override
    public String toString(){
        return "Hours: "+this.hours+"\nRate: "+this.rate;
    }
    
    public double salary(){
        double sal = getHours()*getRate();
        return sal;
    }
}