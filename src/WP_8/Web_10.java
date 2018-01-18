package WP_8;
import java.util.*;
// Using 
public class Web_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> b1 = new ArrayList<String>();

        // use add() method to add elements in the list

        b1.add("A");
        b1.add("B");
        b1.add("C");
        b1.add("D");
        
        System.out.println(b1);

        //Using clone() method to copy b1 into a new b1Copy Arraylist

        ArrayList<String> b1Copy = (ArrayList<String>) b1.clone();

        System.out.println(" b1 Copy elements copied from b1\n "+b1Copy);

	}

}
