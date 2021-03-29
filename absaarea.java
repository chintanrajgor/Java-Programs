import java.util.*;
class absaarea
{
    public static void main(String args[])
    {
        int n=0;
        Scanner sc =new Scanner(System.in);
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        Triangle t=new Triangle();
        while(n!=4)
        {
        System.out.println("Enter choice \n1,circle\n2,rectangle\n3,traingle\n4,exit\n");
        n=sc.nextInt();
        switch(n)
        {
            case 1: c.area();
                    break;
            case 2: r.area();
                    break;
            case 3: t.area();
                    break;
                }
            }
    }
}
abstract class shape
{
    final float pi=3.14f;
    abstract public void area();
}
class Circle extends shape
{
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius: ");
        float r=sc.nextFloat();
        float a=pi*r*r;
        System.out.println("Area of Cirlce= "+a);
    }
}
class Rectangle extends shape
{
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght and width: ");
        float l=sc.nextFloat();
        float w=sc.nextFloat();
        float a=l*w;
        System.out.println("Area of Rectangle= "+a);
    }
}
class Triangle extends shape
{
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lenght and width: ");
        float l=sc.nextFloat();
        float w=sc.nextFloat();
        float a=l*w*0.5f;
        System.out.println("Area of Triangle= "+a);
    }
}
