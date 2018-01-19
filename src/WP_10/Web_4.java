package WP_10;

class Student7{
	int  Roll;
	  String Name;
	  float Mark;
	  Student7(int Roll, String Name, float Mark)  // Argumented Constructor
	   {
	   this.Roll = Roll;   // use of this keyword
	   this.Name = Name;  // use of this keyword
	   this.Mark = Mark; // use of this keyword
	   System.out.println("Roll ??? : " +Roll);
	   System.out.println("Name ??? : " +Name);
	   System.out.println("Mark ??? : " +Mark);
	   }
	  void display() 
	  { 	// Normal Method
	   System.out.println("Roll is : " +Roll);
	   System.out.println("Name is : " +Name);
	   System.out.println("Mark is : " +Mark);
	   }
}

public class Web_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student7 S1=new Student7(1001,"Adira",100F);
		S1.display();
		System.out.println("==========");
		Student7 S2=new Student7(1002,"Raina",99f);
		S2.display();

	}

}
