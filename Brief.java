//1......Using the if and else statement.......
import java.lang.System;//that is the bydefauly package in the java....
import java.util.Scanner;
class Brief
{
public static void main(String[]arr)
{
    System.out.println("Please enter the value");
    //taking the input to the user....
    Scanner k=new Scanner(System.in);
    int a;
     a=k.nextInt();
     if(a>20){
        System.out.println("you are eligibal for voting"+a);
     }
     else(a<20){
        System.out.println("You are not eligibal for voting"+a);
     }
}
}
