package sumit;
interface Add{
	void add(int a, int b); 
}

public class LambdaMultipleParameters {

	public static void main(String[] args) {
		//Using lambda expressions
				Add add=(a, b)->{
					 System.out.println(a + b);
		// TODO Auto-generated method stub

	};
	add.add(10, 20);  

}
}
