package Ibne_8;

import java.util.*;

public class Shafin_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> al = new ArrayList<String>();
        al.add("First");
        al.add("Second");
        al.add("Third");
        al.add("Random");
        List<String> list = new ArrayList<String>();
        
        list.add("Second");
        list.add("Random");
        System.out.println("Does ArrayList contains all list elements?: "
                    +al.containsAll(list));
       list.add("one");// This statement not included
        System.out.println("Does ArrayList contains all list elements?: "
                    +al.containsAll(list));
        
       // a1.addAll(list);
        
      //  System.out.println("All elements are :" + a1.addAll(list));

	}

}
