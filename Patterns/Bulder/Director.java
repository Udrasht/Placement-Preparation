package Patterns.Bulder;

public class Director {
    HouseBulder builder;
    Director(HouseBulder bulder){
        this.builder=bulder;
    }
    
    public House  onestortHouse(){
  
        this.builder.setStories("2");
       
        this.builder.setDoorType("Single Door");
        this.builder.setRoofType("Flat");
        
       return this.builder.build();
    }
    public House twostortHouse(){
        this.builder.setDoorType("Double Door");
        this.builder.setRoofType("Double");
        this.builder.setStories("1");
       return this.builder.build();
        
    }
    
}
