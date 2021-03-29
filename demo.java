import java.util.*;
import org.calculator.arithmatic;
import org.calculator.calcpow;
public class demo {
    public static void main(String[] args) {
        int a,b,x,n=0;
        Scanner sc =new Scanner(System.in);
       
        
       while(n!=8){
        System.out.println("1.Addition\n2.Subraction\n3.muiltiplicaion\n4.Division\n5.modulas\n6.square\n7.cube\n8.Exit");
        n=sc.nextInt();
        switch(n)
        {
          case 1:
          System.out.println("Enter the values of a and b:");
          a=sc.nextInt();
          b=sc.nextInt();
          arithmatic.add(a,b);
          break;
          case 2:
          System.out.println("Enter the values of a and b:");
          a=sc.nextInt();
          b=sc.nextInt();
          arithmatic.sub(a,b);
          break;
          case 3:
          System.out.println("Enter the values of a and b:");
          a=sc.nextInt();
          b=sc.nextInt();
          arithmatic.mult(a,b);
          break;
          case 4:
          System.out.println("Enter the values of a and b:");
          a=sc.nextInt();
          b=sc.nextInt();
          arithmatic.div(a,b);
          break;
          case 5:
          System.out.println("Enter the values of a and b:");
          a=sc.nextInt();
          b=sc.nextInt();
          arithmatic.mod(a,b);
          break;
          case 6:
          System.out.println("Enter the number:");
          x=sc.nextInt();
          calcpow.sqr(x);
          break;
          case 7:
          System.out.println("Enter the number:");
          x=sc.nextInt();
          calcpow.cube(x);
          break;
        }
      }    
    }
}