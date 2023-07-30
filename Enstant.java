//write a program to uses the instant block and the static block..... 
import java.lang.System;
import java.util.Scanner;
class Block
{
    {
       System.out.println("That is the instant block");

    }
    static{
        double f=21.36;
        System.out.println("This is the static argumnet"+f);

    }
    public Block(int x,int y ){
        int z=x+y;
        System.out.println("Two argument type constructure"+z);
    }
}


class Enstant
{
    public static void main(String[]ar)
    {
        Block obj=new Block(10,20);
        
    }
}