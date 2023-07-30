//import java.util.Scanner;
import java.util.Scanner;

class Commands{
    public static void main(String[]args){
        System.out.println("This line is  belong to the  Commands line arguments");
        String []s;
        s=new String[5];
         
        Scanner b=new Scanner(System.in);
        String t=b.nextLine();
        for(int i=0;i<=s.length;i++)
        s[i]=b.nextLine();
        {
            System.out.println(" This the command line aargument");
        }
       /*  for( int i=1;i<5;i++)
        {
            System.out.println(""+s[i]);
        }*/
        
        for(String p :s)
            System.out.println(p);
        

    }
}