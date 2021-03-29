import java.util.*;
public class Employe
{
    public static void main(String[] args)
    {
        employee e=new employee();
        e.accept();
        e.display();
        
        FullTimeEmployee f=new FullTimeEmployee();
        f.accept();
        f.display();
        f.salary();
        
        employee a=new employee();
        a.accept();
        a.display();
        
        PartTimeEmployee p=new PartTimeEmployee();
        p.accept();
        p.display();
        p.salary();
    }
}
class employee
{
    int empno;
    String name;
    int sal;
    
    void accept()
    { 
    Scanner scan=new Scanner(System.in);
    
    System.out.println("Enter Employee Number :");
    empno=scan.nextInt();
    
    System.out.println("Enter Employee Name :");
    name=scan.next();
    
     }
     void display()
      {
         System.out.println("Employee Number :"+ empno);
         System.out.println("Employee Name :"+ name);
      }
}
class FullTimeEmployee extends employee
{
    int basic,hra,da;
    void accept()
    {
        Scanner scan=new Scanner(System.in);
        
    System.out.println("Enter Basic Salary :");
    basic=scan.nextInt();
    
    System.out.println("Enter da :");
    da=scan.nextInt();
    
    System.out.println("Enter hra :");
    hra=scan.nextInt();    
}
void display()
{
    System.out.println("Basic Salary :"+ basic);
    System.out.println("da :"+ da);
    System.out.println("hra:"+ hra);
}
void salary()
{
    
    sal=basic+da+hra;
    System.out.println("Salary of Ful time Employees is :"+sal);
}
}
    
class PartTimeEmployee extends employee
{
    int wage,wrkhrs;
    void accept()
    {
        Scanner scan=new Scanner(System.in);
        
    System.out.println("Enter Employee Wages :");
    wage=scan.nextInt();
    
    System.out.println("Enter Working Hours :");
    wrkhrs=scan.nextInt();
}
void display()
{
   System.out.println("Wages :"+ wage);
   System.out.println("Working Hours:"+ wrkhrs); 
}
void salary() 
{
    sal=wrkhrs*wage;
    System.out.println("Salary of Part time Employees is :"+ sal);
}
}
