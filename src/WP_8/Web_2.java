package WP_8;

import java.util.*;

public class Web_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector B=new Vector();
		
		int id=11;
		String name="Ifana Raina";
		float mark=90.5f;
		char grade='A';
		boolean pass=true;
		Integer a=new Integer(id);
		Float b=new Float(mark);
		Character c=new Character(grade);
		Boolean d=new Boolean(pass);
		
		System.out.println("Vector size is "+B.size());
		
		B.addElement(a);
		B.addElement(name);
		B.addElement(b);
		B.addElement(c);
		B.addElement(d);
		
		System.out.println("Vector size is "+B.size());
		System.out.println("Content of vector is\n "+B);
		
		for ( int i=0; i<B.size();i++) {
			
			System.out.print("Contents of vector  " + i + " is : " );
			System.out.print(B.elementAt(i)); 
			System.out.println();
		}
		
		
		
		
		

	}

}
