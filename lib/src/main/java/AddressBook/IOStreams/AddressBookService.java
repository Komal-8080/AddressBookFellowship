package AddressBook.IOStreams;

import java.util.List;
import java.util.Scanner;

public class AddressBookService {
	
	public enum IOService {
		CONSOLE_IO, FILE_IO, DB_IO, REST_IO
	}

	private List<AddressBookData> AddressBookList;

	public AddressBookService() {
	}

	public AddressBookService(List<AddressBookData> AddressBookList) {
		this.AddressBookList = AddressBookList;
	}

	private void readEmployeePayrollData(Scanner consoleInputReader) {
		System.out.print("Enter First Name ");
		String firstName = consoleInputReader.next();
		System.out.print("Enter Last Name: ");
		String lastName = consoleInputReader.next();
		System.out.print("Enter Phone Number ");
		String phone = consoleInputReader.next();
		System.out.print("Enter City");
		String city = consoleInputReader.next();
		System.out.print("Enter State");
		String state = consoleInputReader.next();
		System.out.print("Enter Zip");
		String zip = consoleInputReader.next();
		System.out.print("Enter email");
		String email = consoleInputReader.next();
		AddressBookList.add(new AddressBookData(firstName, lastName, phone,city,state,zip,email));
	}

	public void writeEmployeePayrollData(IOService ioService) {
		if (ioService.equals(IOService.CONSOLE_IO))
			System.out.println("\nWriting Payroll to Console\n" + AddressBookList);
		else if (ioService.equals(IOService.FILE_IO))
			new AddressBookFileIOService().writeData(AddressBookList);

	}

	public long countEntries(IOService ioService) {
		if (ioService.equals(IOService.FILE_IO))
			return new AddressBookFileIOService().countEntries();
		return AddressBookList.size();
	}

}
