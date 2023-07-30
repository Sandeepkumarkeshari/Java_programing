//Using the methode overriding......
import java.lang.System;
class Purpose
{
    public static void main(String[]args)
    {
       A a=new A();
       a.m1();
    }
}


class A{
    public void m1 ()
    {
        System.out.println("Method  overriding");
    }
 class B extends A{
    public void m1()
    {
        
    }
 }

}