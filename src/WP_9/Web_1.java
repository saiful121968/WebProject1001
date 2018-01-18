package WP_9;

public class Web_1 {

	int i=8;//Instance variable
	
	
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		int k=3; //local variable
		
		System.out.println("Value of local variable k:"+k);
		
		
		Web_1 obj=new Web_1();
		
		obj.showdata(9);
		
		
		Web_1 obj1=new Web_1();
		
		obj1.showdata(10);}
	
	public void showdata(int i)// Argument local variable 
	 
	 {
		//this.i=i;
		
		System.out.println("Value of local argument(call instance)variable:"+i);
		
		}

}
