//using the inheritance concept java program......
import java.lang.*;
class Pat
{
    public Pat(int x )
    {
       System.out.println("That is the zero argument type constructure"+x);
    }
}
class Animal
{
    public static void main(String[]args)
    {
       class Pat extends Animal{
       }
    }
}