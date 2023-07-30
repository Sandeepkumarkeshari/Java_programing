/*class Mythread extends Thread{
    public void run(){
        System.out.println("This concept is the belong to the Thread methode and run methode is very methode for the thread");
    }
}


class Threadss{
    public static void main(String[]args){
     

        Mythread t=new Mythread();
        t.start();

        Mythread t1=new Mythread();
        t1.start();



    }
}*/

/*class Mythread implements Runnable
{
  public void run()
  { 
     for(int i=1;i<=5;i++)
     System.out.println("user defind thread...");  
   }
}

class Test
{
  public static void main(String[] ar)
{
    Mythread m=new Mythread();
          Thread t=new Thread(m);
                t.start();

      for(int i=1;i<=5;i++)
       System.out.println("jvm thread..."); 

           

}

}*/

/*class Mythread extends Thread
{

  public void run()
{
  System.out.println(Thread.currentThread().getName());
    System.out.println(Thread.currentThread().getPriority());
}}

class Test
{
public static void main(String[] ar)                   
{
    Mythread m=new Mythread();
            // m.setPriority(10);
             m.setPriority(Thread.MAX_PRIORITY);
        
      
    Mythread m1=new Mythread();
            // m1.setPriority(1);
             m1.setPriority(Thread.MIN_PRIORITY);
             
              m.start();
              m1.start();
  
}}*/

class Mythread extends Thread
{

  public void run()
{
  
     System.out.println("user defined thread");
}}

class Exceptions
{
public static void main(String[] ar)                   
{
    Mythread m=new Mythread();
             m.start();
            System.out.println(m.getName());
                  
          Mythread m1=new Mythread();
             m1.start();
            System.out.println(m1.getName());    //get the thread name

             m1.setName("btpsthread");  //to set the thread name
             System.out.println(m1.getName());

        System.out.println(Thread.currentThread().getName());  //to get the main thread name

            System.out.println(m1.getID());   //get the id of thread..

              System.out.print(Thread.activeCount());

        
}}