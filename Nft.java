//Write a program to using the private variable and the setter function.....
import java.lang.System;
import java.util.Scanner;
class Further
{ 
     private int r,t;
     public void setData(int u,int v)
     {
        //instance variable=local varibal
        r=u;
        t=v;
       int  q=u+v;
       System.out.println("The private member is the "+q);

     }
    public void member()
    {
        System.out.println("zero parameterise type argument");
    }
    public void member(int l, int b)
    {
        int z=l+b;
        System.out.println("Two argument type means parameterise"+z);
    }
    
}


class Nft{
    public static void main(String[]args)
    {
        System.out.println("Private memberr can be access");
        Further f=new Further();
        f.member();
        f.member(5,7);
       f.setData(7,5);
    }
}