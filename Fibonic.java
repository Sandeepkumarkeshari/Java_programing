import java.util.Scanner;
class Example
{
    public static void main(String[]ar)
    {
        int a=0,b=1,c=a+b,i,f;
        System.out.println("Enter the Fibonic value \n");
        Scanner k=new Scanner(System.in);
        f=k.nextInt();
        for(i=1;i<=f;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println("The fibonic values is the"+c);
        }
    }
}