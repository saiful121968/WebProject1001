package Ibne_8;
import java.util.*;
public class Shafin_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("Results after reverse operation:\n"+list);
        for(String str: list)
        	
            System.out.println(str);

	}

}
