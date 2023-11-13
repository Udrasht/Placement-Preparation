import java.util.*;
class UserDefinedException extends Exception  {
   public UserDefinedException(String str){
        super(str);
    }

}
public class CustomiseException {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
       try{
        if(age<18){
            throw new UserDefinedException("This is user-defined exception");  
        }
        else{
            System.out.println("elligible");
        }
       }
       catch(Exception e) {
        System.out.println("hi "+e);
       }
       
        

    }
    
}
