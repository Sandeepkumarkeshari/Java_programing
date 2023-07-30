//write a program to finding the  of the crcle to using the copy constructure....
import java.util.Scanner;
import java.lang.System;
class Circle{
    int r;
    public Circle(int x)//constructer...
    {
        r=x;
    }
    public Circle(Circle t)//copy constructure...
    {
         r=t.r;
    }
    public void area()
    {
        double a=3.14*r*r;
        System.out.println("Area is the "+a);
    }
}

class Rect
{
  public static void main(String[]ar)
    { 
        int c;
        System.out.println("The radius of the area...");
        Scanner k=new Scanner(System.in);
         c=k.nextInt();
       Circle obj=new Circle(c);
       Circle obj1=new Circle(obj);
       obj.area();
       obj1.area();
    }
}
/*import java.lang.*;
class Rect
{
    int l,b;
    
    public Rect(int x,int y)
    {
        l=x;
        b=y;
    }
    public Rect(Rect k)
    {
        l=k.l;
        b=k.b;
    } 
    public void area ()
    {
        double a=l*b;
        System.out.println("area is"+a);
    }
}
class Test
{
    public static void main(String[]ar)
    {
        int c;
        Scanner k=new Scanner(System.in);
         c=k.nextInt();
        Rect r1=new Rect(c);
        Rect r4= new Rect(r1);
        r1.area();
        r4.area();
}
}*/