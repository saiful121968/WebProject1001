package Ibne_9;

class example{
	int p;
	
   example ( int q) {p=q;}
	example changevalue ()
	{ example m=new example(p*3);
	return m;
	}
}

public class Shafin_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		example c1=new example (7);
		example c2;
		c2=c1.changevalue();
		System.out.println("The value of this c1 = "+c1.p);
		System.out.println("The value of this c2 = "+c2.p);
        c2=c2.changevalue();
        System.out.println("The value of this c1 = "+c1.p);
        System.out.println("The value of this c2 = "+c2.p);
        example c3;
        c3=c2.changevalue();
        System.out.println("The value of this c3 = "+c3.p);
	}

}
;