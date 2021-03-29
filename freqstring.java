import java.util.*;
public class freqstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,count=0,k=0,flag=0;
        String s;
        System.out.println("Enter the string:");
        s=sc.nextLine();
        char c[]=new char[s.length()];
        for(i=0;i<s.length();i++)
        {
            for(j=0;j<s.length();j++)
            {
                flag=0;
              
                for(k=0;k<c.length-1; k++)
                {
                if((int)s.charAt(i)==(int)c[k])
                {
                    flag=1;
                    break;
                }
                }
                if(flag==1)
                {
                    break;
                }
                if((int)s.charAt(i)==(int)s.charAt(j))
                {
                    count++;
                   c[k]=s.charAt(i);
                   k++;
                }
            }
            if(flag!=1)
            System.out.println(s.charAt(i)+"="+count);
               count=0;
        }
    }
}
