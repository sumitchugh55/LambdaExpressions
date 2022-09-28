package sumit;
import java.util.*;

 
public class LambdaForLoop{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Sumit Chugh");  
        list.add("Akash");  
        list.add("Abhishek");  
        list.add("Dheeraj");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  


