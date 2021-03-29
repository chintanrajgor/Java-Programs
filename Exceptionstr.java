import java.util.*;
class StringMismatchException extends Exception
{
    StringMismatchException(String msg){
    super(msg);
    }
}
public class Exceptionstr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        StringMismatchException e=new StringMismatchException("Did not match with required string");
        String s;
        System.out.println("Enter the String");
        s=sc.next();
        if(!"INDIA".equalsIgnoreCase(s)){
            try{
            throw e;
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        }
        else{
            System.out.println("String matched");
        }
    }

}
