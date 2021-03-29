import java.util.*;
public class freqnum
{
  public static void main(String args[]){
    
    int n,i,n1,count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of array");
    n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements of array");
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    System.out.println("Enter the number");
    n1=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(n1==a[i])
        count++;
    }
      System.out.println("Frequency of "+n1+" is "+count);
    }
}
