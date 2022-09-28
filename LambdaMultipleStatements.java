package sumit;



	interface Multiple {
		String sayHello(String name);
	}  
	 
	public class LambdaMultipleStatements {
		public static void main(String args[]){
			Multiple multiple = (message) -> {
				String str1 = "Hello ";  
	                        String str2 = str1 + message;   
	                        return str2;
			};
			 System.out.println(multiple.sayHello("Sumit chugh"));
		}
	}