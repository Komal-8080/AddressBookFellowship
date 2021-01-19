package addressBookFellowship;

import java.util.Scanner;
import java.util.Set;

public class AddressBookManagerInterfaceImplementation implements AddressBookManagerInterface {

	// Creating Object to refer Address Book Interface implemented Functionalities
	AddressBookInterfaceImplementation addressBookInterfaceImplementation = new AddressBookInterfaceImplementation();

	@Override // Method to create New Address Book
	public void newAddressBook() {
		int newAb = 0;
		while (newAb == 0) {
			System.out.println("1] Press 1 to Create New Address Book\n" + "2] Back to Menu");
			Scanner press = new Scanner(System.in);
			int input = press.nextInt();
			switch (input) {
			case 1:
				System.out.println("Enter Address Book Name");
				Scanner abName = new Scanner(System.in);
				String addressBookName = abName.nextLine();
				addressBookInterfaceImplementation.personMap.put(addressBookName, null);
				System.out.println(
						"New Address Book Created SuccessFully go to Open address book to enter person details");
			case 2:
				newAb = 1;
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		}

	}

	// Method to open and edit existing Address Book
	public void openAddressBook() {
		int ablist = 0;
		while (ablist == 0) {
			System.out.println("1] To Open Address Book List\n" + "2] Back to Menu ");
			Scanner value = new Scanner(System.in);
			int in = value.nextInt();
			Set<String> addressBookList = addressBookInterfaceImplementation.personMap.keySet();
			for (String key : addressBookList) {
				System.out.println(key);
			}
			switch (in) {
			case 1:
				System.out.println("");
				System.out.println("Enter Address Book Name");
				Scanner data = new Scanner(System.in);
				String addressBookName = data.nextLine();
				int openAb = 0;
				while (openAb == 0) {
					System.out.println("");
					System.out.println(
							"1.Add Person\n" + "2.Edit Person\n" + "3.Delete Person\n" + "4.Display\n" + "5.Quit");
					System.out.println("Select from above Options");
					Scanner num = new Scanner(System.in);
					int selectedValue = num.nextInt();
					switch (selectedValue) {
					case 1:
						System.out.println("Enter Person Details");
						addressBookInterfaceImplementation.addPerson();
						break;
					case 2:
						System.out.println("");
						addressBookInterfaceImplementation.editPerson();
						break;
					case 3:
						System.out.println("");
						addressBookInterfaceImplementation.deletePerson();
						break;
					case 4:
						System.out.println("");
						addressBookInterfaceImplementation.displayPerson();
						break;
					case 5:
						openAb = 1;
						break;
					default:
						System.out.println("Invalid Option");
						break;
					}
				}
			case 2:
				ablist = 1;
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
		}
	}

	public void searchPerson() {
		int searchlist = 0;
		while (searchlist == 0) {
			System.out.println("1] To Search Person Contact In City\n" + "2]To Search Person Contact In State "
					+ "3] Back to Menu ");
			Scanner value = new Scanner(System.in);
			int entry = value.nextInt();
			switch (entry) {
			case 1:
				System.out.println("Enter City Name");
				Scanner input1 = new Scanner(System.in);
				String city = input1.nextLine();
				addressBookInterfaceImplementation.SearchPersonInACity(city);
				break;
			case 2:
				System.out.println("Enter State Name");
				Scanner input2 = new Scanner(System.in);
				String state = input2.nextLine();
				addressBookInterfaceImplementation.SearchPersonInAState(state);
				break;
			case 3:
				searchlist = 1;
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}

		}
	}
}
