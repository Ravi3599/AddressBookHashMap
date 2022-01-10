package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Person implements InterfaceOne  {
    static Scanner sc = new Scanner(System.in);
    static String firstName,lastName,address,state,email,city;
    static int zip;
    static long phoneNumber;
    ContactInfo infoContact = new ContactInfo();
    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
    Map<String,Contact> detailsBook = new HashMap<>();
    static Map<String,Contact> personByCity = new HashMap<>();
    Map<String,Contact> personByState = new HashMap<>();
	static Map<String,Map<String,Contact>> book = new HashMap<>();

	public void createContact() {
		System.out.println("Enter how many contacts you want to create");
    	int numOfContact = sc.nextInt();
    	while(numOfContact > 0) {
			System.out.println("Enter Name of person");
			String firstName = sc.next();
	    	if(!detailsBook.containsKey(firstName)) {
	    		infoContact.info();
				detailsBook.put(firstName,new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
				numOfContact--;
	    	}
	    	else {
	    		System.out.println("Contact already exists!");
	    	}
    	}
	}
    public void addContact()  {
    	System.out.println("Enter how many contacts you want to add");
    	int numOfContacts = sc.nextInt();
    	while(numOfContacts > 0) {
	    	System.out.println("Enter Name of person");
			String firstName = sc.next();
	    	if(detailsBook.containsKey(firstName)) {
	    		System.out.println("Contact already exists!");
	    		return;
	    	}
	    	else {
	    		infoContact.info();
	    		detailsBook.put(firstName,new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
	    		numOfContacts--;
	    	}
    	}
    }
    public void editContact()  {
    	System.out.println("Enter name of person whose contact you want to edit");
			String firstName = sc.next();
	    	if(detailsBook.containsKey(firstName)) {
	        	infoContact.info();
	    		detailsBook.put(firstName,new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
	    	}
	    	else {
	    		System.out.println("Contact is not present in book");
	    		return;
	    	}
    }
    public void deleteContact()  {
    	System.out.println("Enter name of person whose contact you want to delete");
			String name = sc.next();
	    	if(detailsBook.containsKey(name)) {
	    		detailsBook.remove(name);
	    	}
	    	else {
	    		System.out.println("Contact is not present in book");
	    		return;
	    	}
    }   
    public void display() {
        System.out.println("Created contact list is");
        for(Map.Entry m : detailsBook.entrySet()) {
        	System.out.println(m.getKey()+"--> "+m.getValue());
        }
    }
    public void addToBook() {
	    	System.out.println("Enter Name of Address Book");
	    	String bookName = sc.next();
	    	if(!book.containsKey(bookName)) {
		    	book.put(bookName, detailsBook);
		    	}
	    	else {
	    		System.out.println("Book already exists!");
	    	}
    }
    public void operation() {
    	System.out.println("Enter how many address books you want to add");
    	int noOfAddressBook = sc.nextInt();
    	while(noOfAddressBook > 0) {
    		addContact();
    		addToBook();
    		noOfAddressBook--;
    	}
    }
    public void searchPerson() {
    	System.out.println("Enter person name to search ");
    	String name = sc.next();
    	for(Map.Entry e : detailsBook.entrySet()) {
	    	if(detailsBook.get(name).equals(e.getValue())) {
	    		System.out.println(e.getValue());
	    	}
    	}
    }
    public void displayBook() {
    	System.out.println("Address Books are:");
    	for(Map.Entry e : book.entrySet()) {
        	System.out.println(e.getKey()+"--> "+e.getValue());
        }
    }
}