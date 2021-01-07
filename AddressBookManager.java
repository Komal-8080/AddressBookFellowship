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
		System.out.println("Array of Person : \n"+personData);

	}
 	
 	public void editPerson() {

		System.out.println("Enter person First Name to Edit person details");
		Scanner toedit = new Scanner(System.in);
		String firstName = toedit.nextLine();
		boolean exists = false;
		
		  for (ContactPerson p:personData) {
			 // System.out.println(p.toString());
				  if (firstName.equals(p.firstName)) {
					  exists = true;
					  while (exists == true) {
					  System.out.println("Select an option to edit\n" 
							     +"1] Phone Number\n"
							     +"2] City\n"
							     +"3] State\n"
							     +"4] ZipCode\n"
							     +"5] Email\n"
							     +"6] quit");

					  		Scanner option = new Scanner(System.in);
					  		int num = option.nextInt();
					  		Scanner input = new Scanner(System.in);
					  				switch (num) {
										case 1:
					  						System.out.println("Enter New Phone Number");
					  						String phone = input.nextLine();
					  						p.setPhone(phone);
					  						System.out.println(p.toString());
											System.out.println("*****Person Details Edited Successfully*****");
											break;
					  					case 2:
					  						System.out.println("Enter New City Name");
					  						String city = input.nextLine();
					  						p.setCity(city);
					  						System.out.println(p.toString());
											System.out.println("*****Person Details Edited Successfully*****");
											break;
					  					case 3:
					  						System.out.println("Enter New State Name");
					  						String state = input.nextLine();
					  						p.setState(state);
					  						System.out.println(p.toString());
											System.out.println("*****Person Details Edited Successfully*****");
											break;
					  					case 4:
					  						System.out.println("Enter New Zip Code");
					  						String zip = input.nextLine();
					  						p.setZip(zip);
					  						System.out.println(p.toString());
											System.out.println("*****Person Details Edited Successfully*****");
					  						break;
					  					case 5:
					  						System.out.println("Enter New Zip Code");
					  						String email = input.nextLine();
					  						p.setEmail(email);
					  						System.out.println(p.toString());
											System.out.println("*****Person Details Edited Successfully*****");
											break;
					  					case 6:
					  						exists = false;
					  						break;
					  					default :
				  						System.out.println("Invalid input");
					  					break;
					  				}
					  		  }
				  		}
				  else {
					  System.out.println("Record Not Found");
				  	}
		      }
 	  	}
 	
 	public void deletePerson() {

		System.out.println("Enter person First Name to delete details");
		Scanner todelete = new Scanner(System.in);
		boolean delete = false;
		String firstName = todelete.nextLine();

				for (int i=0; i<personData.size(); i++) {
					String name = personData.get(i).firstName;
						if (firstName.equals(name)) {
							delete = true;	
								while (delete == true) {
									System.out.println("**Warning: Are you sure you want to delete** \n"
											   			+"Enter 1 for yes\n"
											   			+ "Enter 2 for Quit");
									int entry = todelete.nextInt();	
											switch (entry) {
												case 1:
													personData.remove(i);
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
							}		
					   else {		
						   System.out.println("Record Not Found");		
					   }		
				   }
 			}

}
