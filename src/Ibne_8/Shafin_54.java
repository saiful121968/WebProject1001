package Ibne_8;

//copying all content of ArrayList to an array  by calling toArray() method.
import java.util.*;
public class Shafin_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> A = new ArrayList<String>();
        A.add("First");
        A.add("Second");
        A.add("Third");
        A.add("Random");
        System.out.println("Actual ArrayList:"+A);
        String[] B = new String[A.size()];
        A.toArray(B);
        System.out.println(B);

        System.out.println("Created Array content:");
        for(String C:B)
        {
            System.out.println(C);}
       

	}

}
