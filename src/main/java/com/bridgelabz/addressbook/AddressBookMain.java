package com.bridgelabz.addressbook;

import java.io.IOException;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

public class AddressBookMain {
	public static void main(String[] args) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {

		InterfaceOne person1 = new Person();
		person1.createContact();
		person1.addContact();
		person1.editContact();
		person1.deleteContact();
		person1.display();
		person1.addToBook();
		person1.operation();
		person1.displayBook();
		person1.searchPerson();
		person1.addContactByCity();
		person1.viewByCity();
		person1.addContactByState();
		person1.viewByState();
		person1.sortAddressBook();
		person1.sortByCity();
		person1.sortByState();
		person1.writeToAddressBookFile();
		person1.readDataFromFile();
		person1.writeDataToJson();
		person1.readDataFromJson();
		person1.writeDataToCSV() ;
		person1.readDataFromCSV() ;	
	}
}

