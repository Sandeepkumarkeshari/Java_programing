//write a program to find the default value of the all data types.....

//import java.lang.*;
class Test{
 int a;
 float b;
 double c;
 char d;
 byte by;
 String s;
 short sh;
 boolean bl;
 
 public static void main(String[]ar)
 {
    Test t=new Test();
    System.out.println("Default value for int is the"+t.a);
    System.out.println("Default value for float is the"+t.b);
    System.out.println("Default value for double is the"+t.c);
    System.out.println("Default value for char is the"+t.d);
    System.out.println("Default value for byte is the"+t.by);
    System.out.println("Default value for  string is the"+t.s);
    System.out.println("Default value for short is the"+t.sh);
    System.out.println("Default value for boolean is the"+t.bl);


 }
}