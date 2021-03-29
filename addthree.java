import java.util.*;
public class addthree {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        number a=new number();
        System.out.println(a.addnum(n1,n2,n3));
    }
}
class number{
  int addnum(int x,int y,int z){
         int n4;
         n4=x+y+z;
         return n4;
  }
}