package WP_7;

//using compareTo

public class Web_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="His name is saiful";
		String y="His name is saiful";
		String z="My name is saiful";
		String a="My name is islam";
		
		int x1=x.compareTo(y);
		int x2=y.compareTo(z);
		int x3=z.compareTo(x);
		int x4=z.compareTo(a);
		
		System.out.println("Comparision between x and y :\t"+ x1);
		System.out.println("Comparision between y and z :\t"+ x2);
		System.out.println("Comparision between z and x :\t"+ x3);
		System.out.println("Comparision between z and a :\t"+ x4);
		

	}

}
