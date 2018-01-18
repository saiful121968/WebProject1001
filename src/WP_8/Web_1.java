package WP_8;
import java.util.*;

public class Web_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList A= new ArrayList();
		
		System.out.println("Initial size of A "+A.size());
		
		A.add("Allah");
		A.add("is");
		A.add("one");
		A.add("in");
		A.add("the");
		A.add("world");
		A.add(2, "only");
		
		System.out.println("Size of A after addition"+A.size());
		System.out.println("Contents of A "+A);
		
		A.remove("0");
		A.remove(4);
		
		System.out.println("Size of A after deletion  "+A.size());
		System.out.println("Contents of A after deletion  "+A);
		
		
		
		
		

	}

}
