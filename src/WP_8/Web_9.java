package WP_8;
import java.util.*;
// using void clear
public class Web_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> x = new ArrayList<Integer>();

        // use add() method to add elements in the list
        x.add(1);
        x.add(2);
        x.add(3);

        // let us print all the elements available in x

        System.out.println("Printing aList items before using clear method= \n"+x);
        System.out.println("Printing size of x= " + x.size());

        //using clear method

        x.clear();
        System.out.println("Printing aList element after using clear method= "+x);
        System.out.println("size of x after clear() method= " + x.size());

	}

}
