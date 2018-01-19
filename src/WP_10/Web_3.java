package WP_10;

class University{
	
	int Roll; String Name;float Mark;
	
	University( int Roll,String Name,float Mark){
		
		this.Roll=Roll;
		this.Name=Name;
		this.Mark=Mark;
		System.out.println("Roll "+Roll);
		System.out.println("Name "+Name);
		System.out.println("Roll "+Mark);
	}
	
	
}



	
	


public class Web_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		University U=new University(701,"Shafin",99f);
		System.out.println();
		University U1=new University(702,"Ibne",100f);
		System.out.println();
		University U2=new University(703,"Ranzu",99.5f);
		
		
		

	}

}
