package WP_8;
import java.util.*;
// Using addAll(collection c)

public class Web_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First ArrayList Created
        ArrayList<Integer> A1 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list

        A1.add(3);
        A1.add(5);
        A1.add(7);

        // let us print all the elements available in aList1
        System.out.println("Printing all elements of  aList1= "+ A1);

        //Second Arraylist Created
        ArrayList<Integer> A2 = new ArrayList<Integer>(5);

        A2.add(4);
        A2.add(6);
        A2.add(8);
        A2.add(9);

        // let us print all the elements available in A2
        System.out.println("Printing all elements of A2 = "+ A2);


        // adding A2 collections to A1 using addAll method

        A1.addAll(A2);
   System.out.println("Printing all the elements of A1 after using addAll method=\n "+A1);

	}

}
