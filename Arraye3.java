import java.lang.System;
import java.util.Scanner;
class Arraye3{
    public static void main(String[]args){
        int []a;
        a=new int [10];
        System.out.println("This is the reperesented the arraye");

        Scanner s=new Scanner(System.in);
        int   t=s.nextInt();
         for(int i=0;i<a.length;i++)
         a[i]=s.nextInt();
         {
            System.out.println("This is the storage the data in the arraye");
         }
         for// (int i=0;i<a.length;i++)
         (int i=a.length-1;i>0;i--)
         {
            System.out.println("This is the show the data"+a[i]);
            System.out.println(a.length);
         }
    }
}