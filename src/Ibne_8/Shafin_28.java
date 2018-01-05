package Ibne_8;

import java.util.*;

public class Shafin_28 {

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
		
		B.add(a);
		B.add(name);
		B.add(b);
		B.add(c);
		B.add(d);
		
		System.out.println("Vector size is "+B.size());
		System.out.println("Content of vector is\n "+B);
		
		
		
		
		

	}

}
