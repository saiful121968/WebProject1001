package WP_9;

class student{
	
	public int id;
	protected String name;
	private int credit;
	
	void setdata (int id, String name,int credit){
	
	this.id=id;
	this.name=name;
	this.credit=credit;}
	
	
	void getdata() {
		 
				System.out.println("id is : " + id);
				System.out.println("name is : " + name);
				System.out.println("credit is : " + credit) ;
		}
	}


public class Web_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r=7;
		
		student S=new student ();
				
		S.setdata(501, "Shafin", 90);
		
		S. getdata();
		System.out.println("r is ="+r);
	}
		
		 }


