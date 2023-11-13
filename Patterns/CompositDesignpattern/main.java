package Patterns.CompositDesignpattern;

public class main {
    public static void main(String[] args){
        FileSystem file1=new FileLeaf("Border");
        FileSystem file2=new FileLeaf("Don");
        FileSystem file3=new FileLeaf("Hulchel");
        FileSystem file4=new FileLeaf("Dhole");
        DirectorySystem Directory1=new DirectorySystem("Movies");
        Directory1.addfiles(file1);
        DirectorySystem Directory2=new DirectorySystem("Comedy Movies");
        Directory2.addfiles(file3);
        Directory2.addfiles(file4);
        Directory1.addfiles(Directory2);
        DirectorySystem Directory3=new DirectorySystem("Sharuk Movies");
        Directory3.addfiles(file2);
        Directory2.addfiles(Directory3);
        Directory1.ls();


    }
    
}
