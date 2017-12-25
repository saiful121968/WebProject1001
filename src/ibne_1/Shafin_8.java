package ibne_1;

class Address
{
	String address;
}

public class Shafin_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Address myAddress=new Address();
		Address myCurrentAddress=myAddress;
		Address myDesireAddress=myCurrentAddress;
		
		myAddress.address = "USA-Bangladesh";
		
		System.out.println("myAddress : " + myAddress.address);
		System.out.println("myCurrentAddress : " + myCurrentAddress.address);
		System.out.println("myDesireAddress : " + myDesireAddress.address);


		myCurrentAddress.address = "599 Wellington Road, Upper Darby";
		
		System.out.println("myAddress : " + myAddress.address);
		System.out.println("myCurrentAddress : " + myCurrentAddress.address);
		System.out.println("myDesireAddress : " + myDesireAddress.address);


		myDesireAddress.address = "77 Overhill Road, Upper Darby";
		

		System.out.println("myAddress : " + myAddress.address);
		System.out.println("myCurrentAddress : " + myCurrentAddress.address);
		System.out.println("myDesireAddress : " + myDesireAddress.address);
		
		

	}

}
