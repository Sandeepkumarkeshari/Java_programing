class Mythread1 extends Thread{
    public void run(){
        System.out.println("Milty tasking concept of the threads");
    }
}

class Mythread2 extends Thread{
    public void run(){
        System.out.println("Second methode of the Threads methode");
    }
}

class Mythread3 extends Thread{ 
public void run(){
    System.out.println("This is the third concept of the Threads methode");
}
} 

class Run{
    public static void main(String[]args){


        Mythread1 t1= new Mythread1();
        t1.start();


        Mythread2 t2=new Mythread2();
        t2.start();

        Mythread3 t3=new Mythread3();
        t3.start();

   try{
    
   }
        finally{
            System.out.println("This concept is the belong to the exception handling");
        }
    }
}