//write a program for find the area of the rectange and area of the squre....
//a=l*w; Length * width
//a=a*a;

import java.lang.System;
import java.util.Scanner;
class Squre{
    public static void main(String[]args)
    {
        System.out.println("Enter the value\n");
        int a;
        float l,w;
        Scanner k=new Scanner(System.in);
         a=k.nextInt();
         for( int i=1;i<=a;i++)
         {
            System.out.println("The value is the"+i*i);

         }
        //  a=l*w;//Area of the rectange...
        //  a=a*a;//Area of the squre......
    }
}