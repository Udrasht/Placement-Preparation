package Mult;

public class Demomulti7 extends Thread {

    public void run(){
       for(int i=0;i<5;i++){
        try {
            Thread.sleep(30);
            System.out.println("Ram Ram");
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("dekho disturb ho gya");
        }
       }

    }
    public static void main(String[] args){
       
        Demomulti7 m1=new Demomulti7();
        
       
        m1.start();
        
        for(int i=0;i<3;i++){
            System.out.println("jai Shri Ram");
            m1.interrupt();
            
        }
       
    }
}
