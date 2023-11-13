package Patterns.Adapter;

public class AdapterCharger implements AppelCharger {
    private AndroidCharger androidcharger;

    public AdapterCharger(AndroidCharger androidcharger) {
        this.androidcharger= androidcharger;
    }
    public void chargeIPhone(){
    
    androidcharger.chargeAndroidPhone();
    System.out.println("Phone is charge by adapter");

    }
    
    
}
