package Ibne_8;

import java.util.Vector;

public class Shafin_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector B = new Vector();

		 Integer roll;	//  Roll is a wrapper class object
		 String  name;     //   Name is  a  String Object
		 Float mark;    //  Mark is a wrapper class object

		 String r = "501";
		 String  n = "Shakiba";
		 String m = "40.45";

		 roll = Integer.valueOf(r);
		 name = n;
		 mark = Float.valueOf(m);

		 B.addElement(roll);
		 B.addElement(name);
		 B.addElement(mark);
		 
		 System.out.println("List of Vector Elements : "); 
		  for (int i=0; i< B.size(); i++)
		  {
		   System.out.print("Element At " + i + " is: " );
		   System.out.print(B.elementAt(i)); 
		   System.out.println();
		  }

	}

}
