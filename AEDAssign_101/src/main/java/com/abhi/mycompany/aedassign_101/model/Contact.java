package com.abhi.mycompany.aedassign_101.model;

public class Contact {
	
	private String phoneNumberStr;
	private String emailStr;

	public Contact(){
	}

	public Contact(String phoneNumberStr, String emailStr) {
		super();
		this.phoneNumberStr = phoneNumberStr;
		this.emailStr = emailStr;
	}


	public String getPhoneNumberStr() {
		return phoneNumberStr;
	}


	public void setPhoneNumberStr(String phoneNumberStr) {
		this.phoneNumberStr = phoneNumberStr;
	}


	public String getEmailStr() {
		return emailStr;
	}


	public void setEmailStr(String emailStr) {
		this.emailStr = emailStr;
	}
	
	

	
}
