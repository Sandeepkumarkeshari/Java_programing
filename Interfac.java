// Using of the Interface keyword.......
import java.lang.System;
import java.util.Scanner;

 interface Animal{
    public void sound();
    public  void sleep();
    public void eat();
}

class Pet implements Animal{
    public void sound()
    {
        System.out.println("Cheee Cheee");
    }
    public void sleep()
    {
        System.out.println("ZEE zee");
    }
    public void eat()
    {
        System.out.println("eating the chicken");
    }
}
class Interfac
{
    public static void main(String[]args)
    {
      Pet p=new Pet();
      p.sound();
      p.sleep();
      p.eat();
    }
}