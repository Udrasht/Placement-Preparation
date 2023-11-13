package Collections;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[]  args){
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add(200);
        a1.add("udrasht");
        System.out.println(a1);
        ArrayList a2=new ArrayList();
        a2.add(170);
        a2.add(2020);
        a2.add("pal");
        System.out.println(a2);

        a1.addAll(a2);
        System.out.println(a1);
        System.out.println(a2);
        





    }
}
