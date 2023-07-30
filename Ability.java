//write a program to using the  Acces modifier or access specifier to using the methode overlaoding and constructer concept......

import java.lang.*;

class Access{
    public static  void m1()
{
    System.out.println("This is the zero argument type methode");
}   
   public void m1(int x,int y){
     int p=x+y;
    System.out.println("This is the two argument type methode overloading concept"+p);
   }
   public void m1(int x,int y, int z){
    int q=x+y+z;
    System.out.println("This is the three argument type methode overloading concept\t"+q);
   }
   public void m1(int x)
   {
    System.out.println("This is the one argument type mehode overlaosding concept\t"+x);
   }


//    public Access(int a,int b,int c){
//            a=x;
//            b=y;
//            c=z;
//    }
   
}




class Ability
{
    public static void main(String[]ar)
    {
        Access obj=new Access();
        obj.m1();
        obj.m1(5);
        obj.m1(5,6);
        obj.m1(2,4,5);
    }
}