package addressBookFellowship;

//Interface to give body to person functionalities
public interface AddressBookInterface {

	public void addPerson();

	public void editPerson();

	public void deletePerson();

	public void displayPerson();

	public void FindDuplicatePersonInAddressBook();

	public void SearchPersonInACity(String city);

	public void SearchPersonInAState(String state);

	public void countByCity(String city);
	
	public void countByState(String state);
}
