import java.lang.System;
import java.util.Scanner;
class Divison
{
   void  m1(int x){
  System.out.println("One argument types"+x);
}
     int  m2(int x, int y){
      return(x+y);
    }
}

class Primitive
{
  public static void main(String[]ar)
  {
   
    Divison d = new Divison();
       d.m1(20);
       d.m1(10,20);
  }
}