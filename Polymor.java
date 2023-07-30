import java.lang.System;
class Animal
{
public void animalSound()
{
System.out.println("The animal makes sound");
}
}

 class Dog extends Animal{
    public void animalSound(){
    System.out.println("bow bow");
}
 }
class Pig extends Animal{
    public void animalSound(){
        System.out.println("ZEE zee");
    } 
    
}

class Polymor
{
      public static void main(String[]arg)
       {
          Animal a=new Animal();
          Animal a1=new Pig();
          Animal a2= new Dog();
          
          a.animalSound();
          a1.animalSound();
          a2.animalSound();
         
          
    }
    static{
        System.out.println("This is the static block behaviour");
      }
}