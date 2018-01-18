package WP_9;

class Student5{
public int roll;
protected String name;
private float mark;
void setdata ( int R, String S, float M) {
	this.roll=R; this.name=S; this.mark=M;
}
	
	void showdata(){
		   System.out.println("Roll is : " + roll);                 
		   System.out.println("Name is : " + name);                 
		   System.out.println("Mark is : " + mark) ;
}
}

public class Web_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student5 M=new Student5();
		 M.setdata(501,"Sadia", 50.30f);
		
		 M.showdata();
	}

}
