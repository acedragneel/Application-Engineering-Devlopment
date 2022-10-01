package com.abhi.mycompany.aedassign_101.model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Contact{" + "phoneNumberStr=" + phoneNumberStr + ", emailStr=" + emailStr + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.phoneNumberStr);
        hash = 79 * hash + Objects.hashCode(this.emailStr);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contact other = (Contact) obj;
        if (!Objects.equals(this.emailStr, other.emailStr)) {
            return false;
        }
        return Objects.equals(this.phoneNumberStr, other.phoneNumberStr);
    }
    
    

	
}
