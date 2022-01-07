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
    public void display() {
        System.out.println("Created contact list is");
        for(Map.Entry m : detailsBook.entrySet()) {
        	System.out.println(m.getKey()+"--> "+m.getValue());
        }
    }
   
}