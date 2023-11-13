package Patterns.CompositDesignpattern;
import java.util.*;

public class DirectorySystem implements FileSystem {
    String directoryName;
    List<FileSystem> fileNames;
    DirectorySystem(String directoryName){
        this.directoryName=directoryName;
        fileNames=new ArrayList<>();

    }
    public void addfiles(FileSystem fname){
        fileNames.add(fname);
    }
    public void ls(){
        System.out.println("Directory Name: "+directoryName);
        for(FileSystem obj: fileNames){
            obj.ls();
        }
    }

    
}
