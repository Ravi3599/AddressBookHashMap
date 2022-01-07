package com.bridgelabz.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Person implements InterfaceOne  {

    static Scanner sc = new Scanner(System.in);
    static String firstName,lastName,address,state,email,city;
    static int zip;
    static long phoneNumber;
    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
	Map<String,Contact> detailsBook = new HashMap<>();
	
	public void createContact() {
		detailsBook.put("one",new Contact("John","Pat","New Street","Los","USA", 346, 335675768,"john@one.com"));
		detailsBook.put("two",new Contact("Micheal","Sheth","Old Colony", "Mos", "UK", 256, 77854453,"micheal@two.com"));
		detailsBook.put("three",new Contact("Steve","Bryan","Fashion Street","Bos","MK", 866, 4354688,"steve@three.com"));
	}

    public void addContact()  {
    	System.out.println("Enter how many contacts you want to add");
    	int numOfContacts = sc.nextInt();
    	while(numOfContacts > 0) {
	    	System.out.println("Enter id of person");
			String id = sc.next();
	    	if(detailsBook.containsKey(id)) {
	    		System.out.println("Contact already exists!");
	    		return;
	    	}
	    	else {
	    		System.out.println("Enter First Name :");
	        	String fName = sc.next();
	        	System.out.println("Enter Last Name :");
	        	String lName = sc.next();
	        	System.out.println("Enter Address :");
	        	String address = sc.next();
	        	System.out.println("Enter City :");
	        	String city = sc.next();
	        	System.out.println("Enter State :");
	        	String state = sc.next();
	        	System.out.println("Enter Zip :");
	        	int zip = sc.nextInt();
	        	System.out.println("Enter Phone Number :");
	        	long number = sc.nextLong();
	        	System.out.println("Enter Email :");
	        	String mail = sc.next();
	    		detailsBook.put(id,new Contact(fName, lName, address, city, state, zip, number, mail));
	    		numOfContacts--;
	    	}
    	}
    }
        
    public void display() {
        System.out.println("Created contact list is");
        for(Map.Entry m : detailsBook.entrySet()) {
        	System.out.println(m.getKey()+"--> "+m.getValue());
        }
    }
   
}