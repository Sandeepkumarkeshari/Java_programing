//Write a program for print the Radius of the circele and the Curcumface of the circle to take the user input
//a=2*3.14*r;
//c=3.14*r*r;

import java.util.Scanner;
class Circle
{
    public static void main(String[]arr)
    {
        System.out.println("Please enter the value of circle\n");
        int r;
          double a,c;
        Scanner s=new Scanner(System.in);
        r=s.nextInt();
        a=2*3.14*r;
        c=3.14*r*r;
        System.out.println("The radius of the circle is the"+a);
        System.out.println("The curcumface of the circle is the"+c);
    }
}
