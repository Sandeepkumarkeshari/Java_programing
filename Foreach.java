import java.util.Scanner;
class Foreach{
    public static void main(String[]args){
        int [] a;
        a=new int [5];
        System.out.println("This is the using the For each loop");
        

        Scanner c=new Scanner(System.in);
        int d=c.nextInt();
        for(int i=0;i<a.length;i++)
        a[i]=c.nextInt();
        {
            System.out.println();

        }

        for(int  b :a){
            System.out.println(""+b);
        }
        // 
        System.out.println(a.getClass().getName());
        {
            System.out.println("This is the concept of the foreach loop ");
        }


       
    }
     static{
             int a=10;
            int  b=20;
             int c=a+b;
            System.out.println(""+c);
        }
}