import java.lang.System;
import java.util.Scanner;
class Arrays_2d{
    public static void main(String[]args){
        System.out.println("This is the 2d type arrays...");
        //declaired the arrays..
        int [][] size;
         //taking the user input..

        Scanner sc=new Scanner(System.in);
          int rows=sc.nextInt();
          int columns=sc.nextInt();

         size=new int[rows][columns];
       
          for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
       size[i][j]=sc.nextInt();
            }
          }
          for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
              System.out.println(size[i][j]+"");  
            }
          }
          System.out.println("");
    }
}