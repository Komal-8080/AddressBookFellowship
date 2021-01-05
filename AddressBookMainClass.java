package addressBookFellowship;

import java.util.Scanner;

public class AddressBookMainClass {

	public static void main(String[] args) {
		
		AddressBookManager addressBookManager = new AddressBookManager();
		
		System.out.println("---------------------------------------------");
		System.out.println("*******WELCOME TO ADDRESS BOOK PROGRAM*******");
		System.out.println("---------------------------------------------");
		
		int openAb=0;
		while (openAb == 0) {
			System.out.println("");
			System.out.println("1]Add Person\n" 
								+ "2]Edit Person\n" 
								+ "3]Delete Person\n" 
								+ "4]Quit");
			System.out.println("Select from above Options");
			Scanner num = new Scanner(System.in);
			int selectedValue = num.nextInt();

	             switch (selectedValue) {
			case 1:			      
			      System.out.println("");
			      addressBookManager.addPerson();
				break;
			case 2:
			      System.out.println("");
			      addressBookManager.editPerson();
			      break;
			case 3:
			      System.out.println("");
			      addressBookManager.deletePerson();
			      break;
			case 4:
				openAb=1;
				break;
			default:
				System.out.println("Invalid Option");
				break;
	              }
			}
	  }

}
