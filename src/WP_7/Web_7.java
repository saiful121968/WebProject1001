package WP_7;

public class Web_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String ( "Love");
		String b=a;
		System.out.println("The object of a="+a);
		System.out.println("The object of b="+b);
		System.out.println("The object of a located at="+System.identityHashCode(a));
		System.out.println("The reference of b located at="+System.identityHashCode(b));
		
		System.out.println("The reference of b indicated at"+" "+a.toString());
		
		 b=null;
		
			System.out.println("The object of b="+b);
			System.out.println("The object of b located at="+System.identityHashCode(b));
			System.out.println("The object of a located at="+System.identityHashCode(a));
		 
		
		
		

	}

}
