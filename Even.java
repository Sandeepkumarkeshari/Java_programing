//Write a program to print the even number to take the user input......
import java.lang.System;
import java.util.Scanner;
class Even
{
    public static void main(String[]arr)
    {  
        int i;
        double n;
        System.out.println("Please enter the value");
        //Taking the user input............
        Scanner K=new Scanner(System.in);
        n=k.nextInt();
        for(i=1;i<=n;i++){
            if(i%2==0){
                //displaying the result....
                System.out.println("The even number is the"+i);
            }
            System.out.println("");
        }
    }
}


