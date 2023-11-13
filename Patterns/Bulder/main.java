package Patterns.Bulder;

public class main {
    public static void main(String[] args){
        HouseBulder hb1=new HouseBulder();
        Director dir=new Director(hb1);
        House h1=dir.onestortHouse();
        h1.showHouse();
      
        House h2=dir.twostortHouse();
        h2.showHouse();
        // HouseBulder hb1=new HouseBulder();
        // hb1.setDoorType("Double Door");
        // hb1.setRoofType("Flat");
        // hb1.setStories("2");
        // House h1=hb1.build();
        // h1.showHouse();



    }
}
