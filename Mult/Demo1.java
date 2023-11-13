package Mult;

public class Demo1 extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
           
        }
       

    }
    public static void main(String[] args){
        Demo1 m=new Demo1();
        m.start();
        System.out.println(m.getName());
        for(int i=0;i<5;i++){
            System.out.println("hi ");
        }
        
        


    }
}
