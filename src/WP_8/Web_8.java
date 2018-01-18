package WP_8;

import java.util.*;

// Using addAll (int index, collection c)

public class Web_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //ArrayList Created
        ArrayList<Integer> a1 = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        a1.add(6);
        a1.add(4);
        a1.add(9);

        // let us print all the elements available in aList1
        System.out.println("Printing all elements of  aList1= "+ a1);

        ArrayList<Integer> a2 = new ArrayList<Integer>(5);

        a2.add(11);
        a2.add(15);
        a2.add(16);
        a2.add(19);

        System.out.println("Printing all elements of aList2= "+ a2);

        // using addAll method to add collections at specific index
        a1.addAll(2,a2);
        System.out.println("Printing all the elements of a1 after using addAll method=\n "+ a1);

	}

}
