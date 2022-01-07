package com.bridgelabz.addressbook;

public class Book extends Contact{
	String addressBook;
	Book(String firstName, String lastName, String address, String city, String state, int zip, long phoneNumber,
			String email,String addressBook) {
		super(firstName, lastName, address, city, state, zip, phoneNumber, email);
		this.addressBook=addressBook;
	}
	@Override
	public String toString() {
		return "Book [addressBook=" + addressBook + "firstName"+ getFirstName()+ " lastName "+getLastName()+ "address"+getAddress()+"city"+getCity()+"state"+getState()+"zip"+getZip()+"phoneNumber"+getPhoneNumber()+"]";
	}
	

}
