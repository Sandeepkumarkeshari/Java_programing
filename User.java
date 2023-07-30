//user of the static block and the instant block.....
import java.lang.*;
class User
{
    public static void main(String[]args)
    {
        System.out.println("This is belong to the instant block and the static block");
        Type obj=new Type(10,20);
        
      //  obj.Type(10,20);
      //  obj1.Type(obj);

    }
}

class Type
{

    //instant block
    {
        int x=10;
        int y=20;
       int z=x+y;
      System.out.println("The sum of the a and b is the "+z);
    }
    //static block 
    static{
       
        for( int i=1;i<=10;i++){
            System.out.println("Belong to the static block"+i);
                }
    }
//constructure
      public Type(){
        System.out.println("This is the zero argument type constructure");
      }
      //parameterise constructure
      public Type(int a,int b)
      {
        int c=a*b;
        System.out.println("Parameter  type constructure"+c);
      }
      //copy constructure
      public Type(Type t)
      {
       //  t=t.c;
        System.out.println("Copy constructure"+t);
      }

}