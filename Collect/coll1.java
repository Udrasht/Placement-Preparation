package Collect;
import java.util.*;


class coll1{
    public static void main(String[]  args){
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.add(2);
    list.add(8);
    list.add(4);
    list.add(5);
    list.add(6);
    System.out.print(list.size());
    System.out.println(list);
    ListIterator it=list.listIterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }

    }
}