package WP_9;



class Student4 {
	  private int  Roll; // private member;
	  String Name1;
	  String Name2= new String();
	  void setData(){
	   Roll = 701;
	   Name1 = "Raina"; 
	   Name2="Ifana";
	   }
	  void showdata(){
	   System.out.println("Inside Student Class...") ;
	   System.out.println("Roll is : " +Roll);                 
	   System.out.println("Name1 is : " +Name1);
	   System.out.println("Name2 is : " +Name2);
	   
	   }
	  }  

	class Result{
	  float Mark;
	  Student4 S = new Student4();	
			
	  void setData(){
	  S.setData();
	   Mark = 90.50f;
	   }
	  void showdata(){
	   S.showdata();
	   System.out.println("Inside Result  Class...") ;
	   System.out.println("Mark is : " +Mark) ;
	   }
	  }  

public class Web_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result R = new Result();	// Creating object
		
 R.setData();
 R.showdata();
	}

}
