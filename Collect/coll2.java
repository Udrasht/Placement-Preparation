package Collect;
import java.util.*;
class student{
    int id;
    String name;
    String Colleg;
    student(int id,String name,String College){
        this.id=id;
        this.name=name;
        this.Colleg=College;
    }
}

public class coll2  {
    public static void main(String[]  args){
        Stack<student> list=new Stack<student>();
        student s1=new student(1, "udrasht", "IIIT-Hyderabad");
        student s2=new student(2, "udrasht Pal", "GBPIET-Pauri");
        list.push(s1);
        list.push(s2);
        for(student st: list){
            System.out.println("Id: "+st.id+"\nName: "+st.name+"\nCollege: "+st.Colleg);
        }

    }
    
}
