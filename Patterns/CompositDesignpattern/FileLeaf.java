package Patterns.CompositDesignpattern;

public class FileLeaf implements FileSystem{
    String fileName;
    FileLeaf(String fileName){
        this.fileName=fileName;

    }
    public void ls(){
        System.out.println("Movie :" +fileName);
    }
    
}
