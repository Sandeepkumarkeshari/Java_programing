import java.lang.System;

abstract class Ab{
   abstract  public void m1();
     abstract public void m2();
     abstract public void m3();
}

class Ba extends Ab{
    public void m1(){
        System.out.println("This is the follow the abstract methode");
    }

    public void m2(){
        System.out.println("This is the abstract methode part 2");
    }
    public  void m3(){
        System.out.println("This is the abstract methode part3");
    } 
}


class Abstrack{
    public static void main(String[]args){
        Ab b=new Ba();
        b.m1();
        b.m2();
        b.m3();
    }
}
