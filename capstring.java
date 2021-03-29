import java.util.*;
public class capstring 
{
            public static void main(String args[]) 

    {  
        String s,s1="";
        int j=0;
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the string");
        s=sc.nextLine(); 
        for(int i=0;i<s.length();i++){
        if(i==0 || s.substring(i-1,i).equalsIgnoreCase(" ")){    
        s1=s1+s.substring(j,i)+s.substring(i,i+1).toUpperCase();
        j=i+1;
    }
      
    }
      s1=s1+s.substring(j);
      System.out.println(s1); 
    }

} 
