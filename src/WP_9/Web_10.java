package WP_9;
class Example{
	static int i;
	Example (){
		++i;
	}
	void showdata() {
		System.out.println("Number of Objects Created :"+ i);
	}
}
public class Web_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example E1=new Example();
		Example E2=new Example();
		Example E3=new Example();
		Example E4=new Example();
		Example E5=new Example();
		Example E6=new Example();
		 E6.showdata();

	}

}
