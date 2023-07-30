import java.lang.System;
import java.util.Scanner;
class Sports
{
    public static void main(String[]ar)
    {
        Score c=new Score();
        c.m1();
        c.m1(10);
        c.m1(10,20);
    }
}
//Using the methode overloading concept....
class Score
{
    public  void m1()
    {
        System.out.println("Zero argumnet type methode overloading concpt");
    }
    public void m1(int x)
    {
        System.out.println("This is the one argument type methode overloadin concept\t"+x);
    }
    public void m1(int x, int y)
    {
        int z=x+y;
        System.out.println("Two argument type method overloading concept\t"+z);
    }
}