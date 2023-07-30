//Using the pollymorphism concept......
import java.lang.System;

class Music{
    public void song(){
       System.out.println("This is  playing the song");

    }
}

    class Tune extends Music{
        public void song(){
            System.out.println("This is the Keshariya song");
        }
    }
    class Lyrics extends Music{
        public void song(){
            System.out.println("Mai rang sarbato ka tu mithe ghat ka pani song");
        }
    } 
    class Rap extends Music{
        public void song(){
            System.out.println("Mera phla phla pyar song ");
        }
    }
   



class Saper{
    public static void main(String[]args){
        System.out.println("This concept is the uses the polymorphism");
        Music m=new Music();
        m.song();
          Music t=new Tune();
        t.song();
        Music r=new Lyrics ();
        r.song();
         Music l=new Rap();
        l.song();
       
    }
}