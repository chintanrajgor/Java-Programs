import java.util.*;
class employe{
    int empId;
    String empName;
    float basicSalary,da,hra,incomeTax;
    employe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        empName=sc.nextLine();
        System.out.print("Enter Your Employee Id : ");
        empId=sc.nextInt();
        System.out.print("Enter Your Basic Salary : ");
        basicSalary=sc.nextFloat();
        System.out.print("Enter Your DA : ");
        da=sc.nextFloat();
        System.out.print("Enter Your HRA : ");
        hra=sc.nextFloat();
        System.out.print("Enter The Tax  : ");
        incomeTax=sc.nextFloat();
        System.out.println("\n");
    }
    void display(){
        System.out.println("Employee Name : "+ empName);
        System.out.println("Employee Id : "+ empId);
        System.out.println("Employee Basic salary : "+ basicSalary);
        System.out.println("Employee Da : "+ da);
        System.out.println("Employee Hra : "+ hra);
        System.out.println("Employee Tax : "+ incomeTax);
        System.out.println("\n");
    }
    void gross(){
        float grossSalary;
        grossSalary = (basicSalary+hra+da-incomeTax);
        System.out.println("Gross Salary : "+grossSalary);
    }

}
public class Emp {
    public static void main(String[] args) {
        employe E1 = new employe();
        E1.display();
        E1.gross();
    }
}