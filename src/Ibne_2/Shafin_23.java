package Ibne_2;

public class Shafin_23 {

	int k=8;//Instance variable
	
	
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		int k=3; //local variable
		
		System.out.println("Value of local variable k:"+k);
		
		
		Shafin_23 obj=new Shafin_23();
		
		obj.showdata(8);
		
		
		Shafin_23 obj1=new Shafin_23();
		
		obj1.showdata(9);}
	
	public void showdata(int k)// Argument local variable 
	 
	 {
		this.k=k;
		
		System.out.println("Value of local argument(call instance)variable:"+this.k);
		
		}

}
