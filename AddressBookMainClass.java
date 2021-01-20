package addressBookFellowship;

import java.util.Scanner;

public class AddressBookMainClass {

	public static void main(String[] args) {

		// Creating Object to refer to AddressBook Manager Interface Implementation
		// Functionalities
		AddressBookManagerInterfaceImplementation addressBookManagerInterfaceImplementation = new AddressBookManagerInterfaceImplementation();

		// Welcome Message
		System.out.println("---------------------------------------------");
		System.out.println("*******WELCOME TO ADDRESS BOOK PROGRAM*******");
		System.out.println("---------------------------------------------");
		int loop = 0;
		while (loop == 0) {
			System.out.println(
					"1]New AddressBook\n" + "2]Open AddressBook\n" + "3]Search Person\n" + "4]Get Count\n" + "5]Sort By Name\n"+ "6]Quit");
			System.out.println("Select from Above Options");
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
			switch (option) {
			case 1:
				addressBookManagerInterfaceImplementation.newAddressBook();
				break;
			case 2:
				addressBookManagerInterfaceImplementation.openAddressBook();
				break;
			case 3:
				addressBookManagerInterfaceImplementation.searchPerson();
				break;
			case 4:
				addressBookManagerInterfaceImplementation.countPerson();
				break;
			case 5:
				addressBookManagerInterfaceImplementation.sortPersonContactByName();
				break;
			case 6:
				loop = 1;
				System.out.println("***** THANK YOU *****");
				break;
			default:
				System.out.println("Invalid Input !!!");
			}
		}
	}
}
