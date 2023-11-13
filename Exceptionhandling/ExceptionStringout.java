public class ExceptionStringout {
    
public static void main(String[]  args){
    try{String str="hello";
    System.out.println(str.length());
    System.out.println(str.charAt(3));
    System.out.println(str.charAt(3));
    System.out.println(str.charAt(7));
    
    }
    catch(StringIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }


}
}
