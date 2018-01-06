package Ibne_8;

import java.util.Vector;

public class Shafin_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Vector A = new Vector();

		 int    roll = 201;
		 float  mark = 80.5f;
		 String Name = "Adira" ; 
		 String a1,a2;
		 a1= Integer.toString(roll);
		 a2= Float.toString(mark);
		 A.addElement(a1);
		 A.addElement(Name);
		 A.addElement(a2);
		 System.out.println("List of Vector Elements : "); 
		  for (int i=0; i< A.size(); i++)
		  {
		   System.out.print("Element At " + i + " is: " );
		   System.out.print(A.elementAt(i)); 
		   System.out.println();}

	}

}
