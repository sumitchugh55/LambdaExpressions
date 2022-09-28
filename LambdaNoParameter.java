package sumit;
interface Say{  
    public String say();  
}  

public class LambdaNoParameter {
	public static void main(String[] args) {
		 Say s=()->{  
		        return "Say Something.";  
		    };  
		    System.out.println(s.say());  
		
	}

}
