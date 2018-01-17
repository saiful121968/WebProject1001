package Ibne_9;

public class Shafin_23 {

	int i=8;//Instance variable
	
	
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		int k=3; //local variable
		
		System.out.println("Value of local variable k:"+k);
		
		
		Shafin_23 obj=new Shafin_23();
		
		obj.showdata(9);
		
		
		Shafin_23 obj1=new Shafin_23();
		
		obj1.showdata(10);}
	
	public void showdata(int i)// Argument local variable 
	 
	 {
		//this.i=i;
		
		System.out.println("Value of local argument(call instance)variable:"+i);
		
		}

}
