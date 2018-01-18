package WP_8;

//Getting ArrayList content based on range of index by specifing the start and end index of the range, 
//we can get the sub-list.

import java.util.*;


public class Web_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> x = new ArrayList<String>();
        //adding elements to the end
        x.add("First");
        x.add("Second");
        x.add("Third");
        x.add("Fourth");
        x.add("Random");
        x.add("Click");
        System.out.println("Actual ArrayList:\n"+x);
        List<String> list = x.subList(1, 5);
        
        System.out.println("Sub List: "+list);
        
        

	}

}
