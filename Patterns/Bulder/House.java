package Patterns.Bulder;

public class House {
    String Stories;
    String doorType;
    String roofType;

     House(HouseBulder house) {
        this.Stories=house.Stories;
        this.doorType=house.doorType;
        this.roofType=house.roofType;


    }
    public void showHouse(){
        System.out.println("* * * * * * * * * *\nHouse Description \n Number of Stories: "+this.Stories+"\nTypes of Door: "+this.doorType+"\nTypes of Roof:"+this.roofType+"\n* * * * * * * * * *");
    }

    
    
}
