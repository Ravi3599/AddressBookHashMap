package com.bridgelabz.addressbook;

public class AddressBookMain {
	public static void main(String[] args) {

		InterfaceOne person1 = new Person();
		person1.createContact();
		person1.addContact();
		person1.editContact();
		person1.display();
	}
}
