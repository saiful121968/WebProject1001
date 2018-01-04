package Ibne_2;



public class Shafin_24 {
	
	int p=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int q=5; //local variable
		
		System.out.println("Value of local variable k:"+q);
		
		
		Shafin_24 obj=new Shafin_24();
		
		obj.showdata(11);
		
		
		Shafin_24 obj1=new Shafin_24();
		
		obj1.showdata(12);
		}
		
		
	
	  public void showdata(int r)// Argument local variable 
	 
	 {
		this.p=r;
		
		System.out.println("Value of local argument(call instance)variable:"+r);
		
		}



	}


