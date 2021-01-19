package addressBookFellowship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AddressBookInterfaceImplementation implements AddressBookInterface {

	// Array List and Hash Map with List Declaration to store AddressBooks with
	// respect to person details
	List<ContactPerson> personDataArray = new ArrayList<ContactPerson>();
	Map<String, List<ContactPerson>> personMap = new HashMap<>();

	// Method To Add Person Details
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
		personDataArray.add(p);
		FindDuplicatePersonInAddressBook();
		System.out.println("Person Array " + personDataArray);
		System.out.println("Enter Address Book Name to save Person Details");
		String addressBookName = data.nextLine();
		personMap.put(addressBookName, personDataArray);
		System.out.println("*****Person Details Saved Successfully*****");
	}

	// Method to edit Person details
	public void editPerson() {

		System.out.println("Enter person First Name to Edit details");
		Scanner toedit = new Scanner(System.in);
		String firstName = toedit.nextLine();
		boolean exists = false;
		for (ContactPerson p : personDataArray) {
			if (firstName.equals(p.firstName)) {
				exists = true;
				while (exists == true) {
					System.out.println("Select an option to edit\n" + "1] Phone Number\n" + "2] City\n" + "3] State\n"
							+ "4] ZipCode\n" + "5] Email\n" + "6] Quit");
					Scanner edit = new Scanner(System.in);
					int num = edit.nextInt();
					switch (num) {
					case 1:
						System.out.println("Enter New Phone Number");
						Scanner phoneOption = new Scanner(System.in);
						String phone = phoneOption.nextLine();
						p.setPhone(phone);
						System.out.println(p.toString());
						System.out.println("*****Person Phone Details Edited Successfully*****");
						break;
					case 2:
						System.out.println("Enter New City Name");
						Scanner cityOption = new Scanner(System.in);
						String city = cityOption.nextLine();
						p.setCity(city);
						System.out.println(p.toString());
						System.out.println("*****Person City Details Edited Successfully*****");
						break;
					case 3:
						System.out.println("Enter New State Name");
						Scanner stateOption = new Scanner(System.in);
						String state = stateOption.nextLine();
						p.setState(state);
						System.out.println(p.toString());
						System.out.println("*****Person State Details Edited Successfully*****");
						break;
					case 4:
						System.out.println("Enter New Zip Code");
						Scanner zipOption = new Scanner(System.in);
						String zip = zipOption.nextLine();
						p.setZip(zip);
						System.out.println(p.toString());
						System.out.println("*****Person Zip Code Details Edited Successfully*****");
						break;
					case 5:
						System.out.println("Enter New Email id");
						Scanner emailOption = new Scanner(System.in);
						String email = emailOption.nextLine();
						p.setEmail(email);
						System.out.println(p.toString());
						System.out.println("*****Person Email Details Edited Successfully*****");
						break;
					case 6:
						exists = false;
						break;
					default:
						System.out.println("Invalid input");
						break;
					}
				}
			} else {
				System.out.println("Record Not Found");
			}
		}
	}

	// Method to delete Person details
	public void deletePerson() {

		System.out.println("Enter person First Name to delete details");
		Scanner todelete = new Scanner(System.in);
		boolean delete = false;
		String firstName = todelete.nextLine();
		for (int i = 0; i < personDataArray.size(); i++) {
			String name = personDataArray.get(i).firstName;
			if (firstName.equals(name)) {
				delete = true;
				while (delete == true) {
					System.out.println("**Warning: Are you sure you want to delete** \n" + "Enter 1 for yes\n"
							+ "Enter 2 for Quit");
					int entry = todelete.nextInt();
					switch (entry) {
					case 1:
						personDataArray.remove(i);
						System.out.println("Person details deleted");
						break;
					case 2:
						delete = false;
						break;
					default:
						System.out.println("Invalid Entry");
						break;
					}
				}
			} else {
				System.out.println("Record Not Found");
			}
		}
	}

	// Method to view Person details in Address Book
	public void displayPerson() {

		int display = 0;
		while (display == 0) {
			System.out.println("1] To Open AddressBook\n" + "2] Back to Menu");
			Scanner input = new Scanner(System.in);
			int value = input.nextInt();
			switch (value) {
			case 1:
				System.out.println("Enter Address Book name to dispaly person details");
				Scanner data = new Scanner(System.in);
				String addressBookName = data.nextLine();
				System.out.println(addressBookName + " :\n");
				System.out.println(personMap.get(addressBookName));
				break;
			case 2:
				display = 1;
				break;
			default:
				System.out.println("Invalid Entry");
				break;
			}
		}
	}

	//Method to check and remove if person details are repeated
	public void FindDuplicatePersonInAddressBook() {
		Set<String> items = new HashSet<>();

		Set<ContactPerson> items1 = personDataArray.stream().filter(n -> !items.add(n.firstName))
				.collect(Collectors.toSet());
		for (ContactPerson p : items1) {
			System.out.println(p.firstName + " is Duplicate entry cannot add to Address Book");
			personDataArray.remove(p);
		}
	}
}
