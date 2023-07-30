/*import java.lang.System;
import java.util.Scanner;
class Using{
    public static void main(String[]args){
        System.out.println("pls enter the values...");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        System.out.println(""+i);
    }
}*/

//For finding the class name for the arrays....
/*import java.lang.System;
class Using{
    public static void main(String[]args){
        String []a;
        a=new String[5];
        System.out.println(a.getClass().getName());
    }
}*/

//2d dimensional Arrays....
/*import java.lang.System;
class Using{
    public static void main(String[]args){
        int [][]a;
        a=new int [3][2];
        for (int i=0;i<=3;i++){
            for(int j=0;j<=2;j++){

            }
        }
        for (int i=0;i<=3;i++){
            for(int j=0;j<=2;j++){
            System.out.println(""+a[i][j]);

            }
            System.out.println();
        }
        

        
    }
}*/

/*import java.lang.System;
public class Using {
    public static void main(String[] args) {
    int a = 10;
    while(a > 5) {
        int b = 1;
        System.out.print(b + " ");
        a--;
    }
    }   s
}*/


import java.lang.System;
class Using{
    public static void main(String[]args){
    int [] marks;
    marks=new int[5];
    //int marks[]={97,98,64};
    marks[0]=97;//phy
    marks[1]=98;//chem
    marks[2]=64;//math
    System.out.println(""+marks[0]+" "+marks[1]+" "+marks[2]);

    }
}