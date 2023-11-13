package StringsPrac;

public class StringBuffer1 {
    public
     static void main(String[]  args){
        String S1="Java";
        String S2="Java";
        StringBuffer  S3=new StringBuffer("Java");
        StringBuffer  S4=new StringBuffer("Java");
        String  S5=new String("Java");
        String  S6=new String("Java");

       System.out.println("comparision of two string object"); 
        if(S1.equals(S2)){
            System.out.println("True S1.equals(S2)");
        }
        else{
            System.out.println("False S1.equals(S2)");
        }
        if(S1==S2){
            System.out.println("True (S1==S2)");
        }
        else{
            System.out.println("False (S1!=S2)");
        }




        System.out.println("comparision of two string object with new"); 

        if(S5.equals(S6)){
            System.out.println("True S5.equals(S6)");
        }
        else{
            System.out.println("False S5.equals(S6)");
        }
        if(S5==S6){
            System.out.println("True (S5==S6)");
        }
        else{
            System.out.println("False (S5!=S6)");
        } 



        System.out.println("comparision of new string with  string object"); 
        if(S5.equals(S1)){
            System.out.println("True S5.equals(S1)");
        }
        else{
            System.out.println("False S5.equals(S1)");
        }
        if(S5==S1){
            System.out.println("True (S5==S1)");
        }
        else{
            System.out.println("False (S5!=S1)");
        }


        
        // if(S5==S3){
        //     System.out.println("True (S5==S3)");
        // }
        // else{
        //     System.out.println("False (S5!=S3)");
        // }


        System.out.println("comparision of two stringBuffer object with new"); 
        if(S3==S4){
            System.out.println("True (S3==S4)");
        }
        else{
            System.out.println("False S3==S4");
        }
        if(S3.equals(S4)){
            System.out.println("True S3.equals(S4)");
        }
        else{
            System.out.println("False S3.equals(S4)");
        }


        System.out.println("comparision of Stringuffer and  string"); 
        if(S3.equals(S1)){
            System.out.println("True S3.equals(S1)");
        }
        else{
            System.out.println("False S3.equals(S1)");
        }

        System.out.println("comparision of  stringBuffer and new String object"); 
        if(S5.equals(S3)){
            System.out.println("True S5.equals(S3)");
        }
        else{
            System.out.println("False S5.equals(S3)");
        }
        
        System.out.println("String Buffer Capicity");
        StringBuffer  S7=new StringBuffer("Udrasht Pal Iam Itio");
        System.out.println(S7.length());
        System.out.println(S7.capacity());
        S7.setLength(5);
        System.out.println(S7);

        StringBuffer  S8=new StringBuffer("C");
        System.out.println(S8.length());
        System.out.println(S8 .capacity());


        
     }
    
}
