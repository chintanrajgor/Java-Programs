import java.util.*;

public class adddistance {
    public static void main(String[] args) {
        Distance d1=new Distance();
        Distance d2=new Distance();
        Distance d3=new Distance();
        d1.input();
        d2.input();
        d3.feet=d1.feet+d2.feet;
        d3.inches=d1.inches+d2.inches;
        while(d3.inches>11)
        {
            d3.inches=d3.inches-12;
            d3.feet++;
        }
        System.out.println("sum of distances is:"+d3.feet+"."+d3.inches);
    }
}
class Distance{
    Scanner sc=new Scanner(System.in);
    int feet,inches;
        float distance;
    void input(){
        System.out.println("Enter the distance");
        distance=sc.nextFloat();
        feet=(int)distance;
        inches=(int)((distance-feet)*10);

    }
}