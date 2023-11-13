package Mult;

public class Demo2Multi3 extends Thread {
   public void run(){
        System.out.println("Hello");
        System.out.println("Thread naam inside class batao : "+getName());
    }
    public static void main(String[] args){
        Thread t= Thread.currentThread();
        System.out.println("Thread naam batao : "+t.getName());
        System.out.println("Current Thread naam batao : "+Thread.currentThread().getName());
        System.out.println("Thread priority batao : "+t.getPriority());
        Demo2Multi3 m=new Demo2Multi3();
       
        m.start();
      

    }
    
}
