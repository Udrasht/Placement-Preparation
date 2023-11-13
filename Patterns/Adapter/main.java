package Patterns.Adapter;

public class main {

   public static void main(String[] args){
    AdapterCharger adpt=new AdapterCharger(new Dkcharger());
    Iphone iphone=new Iphone(adpt);
    iphone.chargePhone();
   }
    
}
