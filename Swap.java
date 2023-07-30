//2......Write a program for swap the two numbers......

import java.lang.System;
import java.util.Scanner;
class Swap
{
    public static void main(String[] arr)
    {
        System.out.println("Please enter the two numbers.....");
        int a,b;
        Scanner  k=new Scanner(System.in);
         a=k.nextInt();
         b=k.nextInt();
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("The value of the first swap number is the"+a+"\nThe value of the Second swap number is the"+b);
         

    }
}