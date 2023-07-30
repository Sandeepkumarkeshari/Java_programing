//write a program to find the odd number to take the user input.....

import java.lang.System;
import java.util.Scanner;
class Odd
{
    public static void main(String[]arr)
    {
        int i;
        double n;
        System.out.println("Enter the value");
        Scanner K=new Scanner(System.in);
         n=k.nextInt();
         for(i=1;i<=n;i++)
         {
            if(i%2!=0){
                System.out.println("The odd number is the"+i);
            }
         }
    }
}