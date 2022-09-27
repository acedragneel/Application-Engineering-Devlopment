package com.abhi.mycompany.aedassign_101.model;

public class Contact {
	
	private Long phoneNumberStr;
	private String emailStr;

	public Contact(){
	}

	public Contact(Long phoneNumberStr, String emailStr) {
		super();
		this.phoneNumberStr = phoneNumberStr;
		this.emailStr = emailStr;
	}


	public Long getPhoneNumberStr() {
		return phoneNumberStr;
	}


	public void setPhoneNumberStr(Long phoneNumberStr) {
		this.phoneNumberStr = phoneNumberStr;
	}


	public String getEmailStr() {
		return emailStr;
	}


	public void setEmailStr(String emailStr) {
		this.emailStr = emailStr;
	}
	
	

	
}
