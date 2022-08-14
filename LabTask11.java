
package labtask11;

public class LabTask11 {

    public static void main(String[] args) {
        
       
        PartTimeEmployee pt;
        pt = new PartTimeEmployee("aisha",23,"260 Wall Street", "ECE","Engineer",7,1000);
        System.out.println("Salary of part time employee: "+pt.salary());
   
        FullTimeEmployee ft = new FullTimeEmployee("Karim",24,"183 Wolf Street","ECE","Engineer",15000,25);
        System.out.println("Salary of full time employee: "+ft.salary());
    }
}
