package Patterns.Bulder;

public class HouseBulder {
    String Stories;
    String doorType;
    String roofType;
    public void setStories(String stories) {
        this.Stories = stories;
    }
    public void setDoorType(String doorType) {
        this.doorType = doorType;
    }
    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }
    public House build(){
        return new  House(this);
    }
    
    
}
