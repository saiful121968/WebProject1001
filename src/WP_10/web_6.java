package WP_10;

class Student8{
	 int Roll; String Name;
	 Student8(){
		 Roll=501;
		 Name="Adira";
		 System.out.println("Default constructor "+Roll);
		 System.out.println("Default constructor "+Name);
	 }
	 
	public void finalize () {
		Roll=502;
		Name="Sadia";
		System.out.println("Finalize constructor "+Roll);
		 System.out.println("Finalize constructor "+Name);
		
	}
}

public class web_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student8 S=new Student8();
		S.finalize();

	}

}
