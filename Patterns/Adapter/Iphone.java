package Patterns.Adapter;

public class Iphone {
   private AppelCharger appelcharger;
     Iphone(AppelCharger appelcharger){
        this.appelcharger=appelcharger;

     }

    public void  chargePhone(){
        appelcharger.chargeIPhone();
    }
    
}
