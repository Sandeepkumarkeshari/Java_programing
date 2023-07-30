import java.lang.System;
class Adda
{
    int  a,b,c;
    void add()
    {
        c=a+b;
        System.out.println("Addition is the"+c);
    }
    void m1(){
        this.a=10;
        this.b=10;
        this.add();
    }

}

class This
{
    public static void main(String[]ar)
    {
       Adda obj=new Adda();
       obj.a=7;
       obj.b=8;
       obj.add();
       obj.m1();

    }
}