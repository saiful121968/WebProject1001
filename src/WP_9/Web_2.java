package WP_9;



public class Web_2 {
	
	int p=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      int q=5; //local variable
		
		System.out.println("Value of local variable q:"+q);
		
		
		Web_2 obj=new Web_2();
		
		obj.showdata(11);
		
		
		Web_2 obj1=new Web_2();
		
		obj1.showdata(12);
		}
		
		
	
	  public void showdata(int r)// Argument local variable 
	 
	 {
		this.p=r;
		
		System.out.println("Value of local argument(call instance)variable:"+r);
		
		}



	}


