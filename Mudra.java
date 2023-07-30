
//write a program to using the constructer....
import java.lang.System;
class Kaushal

{
    int acc,bal;

    public Kaushal(int a){//constructer look the class type and their are not return type....
        acc=a;
        bal=0;
    }
    public  void deposite(int amt){
        bal=bal+amt;
    }
    public void  widraw(int amt){
        bal=bal-amt;
    }
    public  void check()
    {
        System.out.println("The avalabeln balance is the "+bal);
    }
}

class Addi{
    public void add(int a,int b){
        int  c=a+b;
        System.out.println("The addition is the"+c);
    }
    public  void multi(int  x,int  y)
    {
      int z=x*y;
    }

}
class Mudra
{
    public static void main(String[]ar)
    {
        Kaushal k=new Kaushal(3638);
        k.deposite(50000);
        k.widraw(15000);
        k.check();


        Kaushal k1=new Kaushal(2211);
        k1.deposite(45000);
        k1.widraw(35000);
        k1.check();


        Kaushal k2=new Kaushal(1381);
        k2.deposite(78500);
        k2.widraw(78000);
        k2.check();

        Kaushal k3=new Kaushal(9292);
        k3.deposite(9000);
        k3.widraw(8500);
        k3.check();


        Kaushal k4 =new Kaushal(6467);
        k4.deposite(4500);
        k4.widraw(4500);
        k4.check();
      


        Addi k5=new Addi();
        k5.add(10,15);
        k5.multi(4,5);

    }
}