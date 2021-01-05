package addressBookFellowship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AddressBookManager implements AddressBookManagerInterface{
	
	public static ArrayList<ContactPerson> personData = new ArrayList<ContactPerson>();

 	public void addPerson() {
 		
	    Scanner data = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName = data.nextLine();
		System.out.println("Enter Last Name");
		String lastName = data.nextLine();
		System.out.println("Enter Phone Number");
		String phone = data.nextLine();
		System.out.println("Enter City Name");
		String city = data.nextLine();
		System.out.println("Enter State ");
		String state = data.nextLine();
		System.out.println("Enter Zip Code");
		String zip = data.nextLine();
		System.out.println("Enter Email Id");
		String email = data.nextLine();
		ContactPerson p = new ContactPerson(firstName, lastName, phone, city, state, zip, email);
		personData.add(p);
		System.out.println("Array of Person : "+personData);

	}

}
