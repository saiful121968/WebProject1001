package WP_9;

class Student2{
	
	float Mark1, Mark2, Tutorial, Total,GTotal;
	
	float setdata ( float M1, float M2) {
		
		Mark1=M1;
		Mark2=M2;
		Total=Mark1+Mark2;
		return Total;
	}
	void getdata() {
		Mark1=60; 
	    Mark2=30;
	    Tutorial=10;
	    GTotal=Mark1+Mark2+Tutorial;
	    System.out.println(GTotal);
	}
}

public class Web_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 S=new Student2();
		
		S.getdata();
		
		
		

	}

}
