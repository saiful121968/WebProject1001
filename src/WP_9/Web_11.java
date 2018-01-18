package WP_9;



class Student6{
	public int  Roll;
	protected String Name;
	private float Mark;

	void setData(int Roll, String Name, float Mark) {
		this.Roll = Roll ;
		this.Name = Name;
		this.Mark = Mark ;
	}

	void display(){
		System.out.println("Roll is : " + Roll);
		System.out.println("Name is : " + Name);
		System.out.println("Mark is : " + Mark) ;	}
}




public class Web_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student6 S1 = new Student6();	// Creates object S1
		Student6 S2 = new Student6();	// Creates object S2

		S1.setData(701, "Shakiba", 99);  // Invokes S1 objects'a setData() method
		S2.setData(702, "Sadia", 100);  // Invokes S2 objects'a setData() method

		S1.display(); 		// Invokes S1 objects'a display() method
		System.out.println();	// Invokes S1 objects'a display() method
		S2.display();

		 if (S1.Roll == S2.Roll) // If (S1.Roll == S2.Roll) is true
			 System.out.println("Shakiba and Sadia have same roll");
		 else // If (S1.Roll != S2.Roll) is false
			 System.out.println("Shakiba and Sadia do not have same roll");

		 if (S1 == S2) // If (S1 == S2) is true
			 System.out.println("The students S1 and S2 are same ");
		 else // If (S1 != S2) is false
			 System.out.println("The students S1 and S2 are NOT same ");

	}

}
