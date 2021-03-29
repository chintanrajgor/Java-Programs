import java.util.*;
public class factorial {
    public static void main(String[] args) {
        fact f=new fact();
       Scanner sc=new Scanner(System.in);
       int x,n;
       System.out.println("Enter the number");
       x=sc.nextInt();
       System.out.println("factorial of"+x+"is"+f.factorial(x));
    }
}
class fact{
    int factorial(int x)
    {
        int fact=1,i;
        for(i=x;i>1;i--)
        {
            fact=fact*i;
        } 
        return fact;
    }
}