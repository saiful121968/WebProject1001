package WP_10;

class Drexel{
	int  Roll;	
	  String Name;
	  float Mark;	
Drexel ( int R, String N, float M  ){
	
	   Roll = R;
	   Name = N; 
	   Mark = M;
	   System.out.println("Roll 111 : " +Roll);                 
	   System.out.println("Name 111 : " +Name);
	   System.out.println("Mark 111 : " +Mark);
	   
	   
}

Drexel (Drexel S )// copy constructor
{
	   Roll = S.Roll ; 
	   Name = S.Name ; 
	   Mark = S.Mark;
	   System.out.println("Roll 222 : " +Roll);                 
	   System.out.println("Name 222 : " +Name);
	   System.out.println("Mark 222 : " +Mark);
}
void display()
{
System.out.println("Roll is : " +Roll);                 
System.out.println("Name is : " +Name);
System.out.println("Mark is : " +Mark);
}
	
}

public class Web_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drexel S1=new Drexel(501,"Ifana", 100);
		 S1.display();
		System.out.println();
		Drexel S2=new Drexel(502,"Shakiba", 100);
		 S2.display();
		System.out.println();
		Drexel S=new Drexel(501,"Raina", 100);
		 S.display();
		System.out.println();
		

	}

}
