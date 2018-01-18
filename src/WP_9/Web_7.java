package WP_9;



class Student3{	
	
	
int showdata(){
	System.out.println("I Love my family");
 
  return 1;	// Method Terminated

  }

float add(int x, int y){
	
	float sum = (x + y); 
	return sum;
 }
 }

public class Web_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student3 s = new Student3();  // S is an object array of Sample class
		 System.out.println("I Love java programming");
		 System.out.println("????????????????????????");
		 
		 s.showdata(); // Method Call
		 
		 
		 System.out.println("Sum = " + s.add(2, 5));
		 System.out.println("Sum = " + s.add(20, 5));
		 
		 }

}
