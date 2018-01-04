package ibne_1;
// Using equalsIgnorecase
public class Shafin_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Moulana Bhasany";
		String b="Moulana Delaware Hossain";
		String c="Moulana Tareq Monowar";
		String d="MoulanaBhasany";
		String e="Moulana delaware hossain";
		
		boolean a1=a.equalsIgnoreCase(b);
		boolean a2=a.equalsIgnoreCase(d);
		boolean a3=b.equalsIgnoreCase(b);
		boolean a4=c.equalsIgnoreCase(d);
		boolean a5=b.equalsIgnoreCase(e);
		
		System.out.println("a1\t"+a1);
		System.out.println("a2\t"+a2);
		System.out.println("a3\t"+a3);
		System.out.println("a4\t"+a4);
		System.out.println("a5\t"+a5);
		

	}

}
