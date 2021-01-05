package addressBookFellowship;

public class AddressBookMainClass {

	public static void main(String[] args) {
		
		AddressBookManager addressBookManager = new AddressBookManager();
		
		System.out.println("---------------------------------------------");
		System.out.println("*******WELCOME TO ADDRESS BOOK PROGRAM*******");
		System.out.println("---------------------------------------------");
		addressBookManager.addPerson();
		
	}

}
