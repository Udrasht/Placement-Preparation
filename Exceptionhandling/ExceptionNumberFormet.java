
import java.util.*;
class ExceptionNumberFormet{
    public static void main(String[] args) {  
          
        try{    
             int a[]=new int[5];    
             a[5]=30/0;    
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println(e.getMessage());  
                // System.out.println(e.toString());
                e.printStackTrace();
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }   
               
                       
            System.out.println("rest of the code");    
 }  
}