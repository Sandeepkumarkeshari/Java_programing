
//write a program to using the methode overloading concept......
import java.lang.*;

class Concept{
   public void s1()
   {
    System.out.println("This is the zero argument methode");
   }
    public void s1(int x,int y){
    int z=x+y*5;
    System.out.println("Two argument type"+z);
   }
   public void s1(int a,int b,int c)
   {
    int d=a+b-c*2;
    System.out.println("Three argument type"+d);
   }
   public void s1(int j){
    System.out.println("One argument types"+j);
   }
}


class Loading
{
    public static void main(String[]args)
    {
        System.out.println("This is the methode overloading concept\n");
          

        Concept c=new Concept();
        c.s1();
        c.s1(10);
        c.s1(10,20);
        c.s1(2,4,6);
    }
}