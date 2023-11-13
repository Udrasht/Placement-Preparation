package Mult;

public class Demoprority extends Thread {
    public void run(){
        Thread.currentThread().setName("udrasht");
        Thread.currentThread().setPriority(4);
        System.out.println( Thread.currentThread().getName());
        System.out.println( Thread.currentThread().getPriority());
        Thread.currentThread().setName("Rohan");
        Thread.currentThread().setPriority(10);
        System.out.println( Thread.currentThread().getName());
        System.out.println( Thread.currentThread().getPriority());

    }
    
    public static void main(String[] args){
        Demoprority d1=new Demoprority();
        d1.start();
    }
}
