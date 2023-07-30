//Write a java  program to using the copy constructer.........
import java.lang.System;

class Demo{
    public void m1( int x){
        System.out.println("one argument type"+x);
    }
    public void m1(int x, int y){
        int z=x+y;
        System.out.println("This is two parameter type"+z);
    }
   
}

class Copy
{
    public static void main(String[]ar){
        System.out.println("This is the copy type constructure");
          Demo c=new Demo();
          c.m1(10);
          c.m1(10,20);
        
    }
}