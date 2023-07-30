import java.util.Scanner;
class Exceptions{
    public static void main(String[]args){
        System.out.println("This concept is the belong to the exception handling");
    
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        try{
        for(int i=1;i<=t;i++){
System.out.println(""+i);
//int c=i/0;
}
        }
 catch(Exception q){
          System.out.println("Catch concept");
        } 

        finally{
            System.out.println("Destroyed the automaticaly code ");
        }
    }
}



