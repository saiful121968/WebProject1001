package WP_10;

class Student{
	public int Roll;
	protected String Name;
	private  int Mark;
	Student(){
		
		Roll=701;
		Name="Shafin";
		Mark=99;
		System.out.println("Student : "+Roll+" " +" "+ Name +" " +Mark);
	}
}

public class Web_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student S=new Student();

	}

}
