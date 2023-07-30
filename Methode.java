import java.lang.System;
class Jandhan
{
int acc,bal;
public Jandhan( int a)
{
    acc =a;
    bal=5000;
}


    public void deposit( int amt)
    {
        bal=bal+amt;
    }
 public void widraw(int amt)
 {
    bal=bal-amt;
 }
 public void show()
 {
    System.out.println("Avalaible amount is the"+bal);
 }
}


class Methode
{
    public static void main(String[]ar)
    {
       Jandhan sa=new Jandhan(6181);
       sa.deposit(1500);
       sa.widraw(1000);
       sa.show();


       Jandhan ma =new Jandhan(6182);
       ma.deposit(10000);
       ma.widraw(2000);
       ma.show();

       Jandhan dha=new Jandhan(6183);
       dha.deposit(50000);
       dha.widraw(30000);
       dha.show();
    }
}