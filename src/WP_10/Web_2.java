package WP_10;



class Example{
	
	private int a2, a0, a1;
	 Example() {
	 a0 = 0; 
	 a1 = 1; 
	 a2 = a0 + a1;
	 }
	  void Inc()
	{
	 a0 = a1; 
	 a1 = a2; 
	 }
	void display()
	{
	 System.out.print(a2); 
	 a2 = a0 + a1;
	 }
}

public class Web_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example E= new Example();
		//Creating object and Calling Constructor Method
		 System.out.println("Frist 12 Fibonacci Numbers are:");
		 for (int i=1; i<=12; i++) {
		  E.display();
		  System.out.print("  ");
		  E.Inc();
		  }

	}

}
