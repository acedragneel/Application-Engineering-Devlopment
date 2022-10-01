package com.abhi.mycompany.aedassign_101.model;

import java.util.Date;
import java.util.Objects;

public class Employee {
	
	private String nameStr;
	private int employeeId;
	private int age;
	private String genderStr;
	private Date startDate;
	private String levelStr;
	private String teamInfoStr;
	private String positionTitleStr;
        private String photo;
        
	private Contact contact = new Contact();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String nameStr, int employeeId, int age, String genderStr, Date startDate, String levelStr,
			String teamInfoStr, String positionTitleStr,String photo) {
		super();
		this.nameStr = nameStr;
		this.employeeId = employeeId;
		this.age = age;
		this.genderStr = genderStr;
		this.startDate = startDate;
		this.levelStr = levelStr;
		this.teamInfoStr = teamInfoStr;
		this.positionTitleStr = positionTitleStr;
                this.photo = photo;
	}

	public String getNameStr() {
		return nameStr;
	}

	public void setNameStr(String nameStr) {
		this.nameStr = nameStr;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenderStr() {
		return genderStr;
	}

	public void setGenderStr(String genderStr) {
		this.genderStr = genderStr;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getLevelStr() {
		return levelStr;
	}

	public void setLevelStr(String levelStr) {
		this.levelStr = levelStr;
	}

	public String getTeamInfoStr() {
		return teamInfoStr;
	}

	public void setTeamInfoStr(String teamInfoStr) {
		this.teamInfoStr = teamInfoStr;
	}

	public String getPositionTitleStr() {
		return positionTitleStr;
	}

	public void setPositionTitleStr(String positionTitleStr) {
		this.positionTitleStr = positionTitleStr;
	}

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }

    @Override
    public String toString() {
        return "Employee{" + "nameStr=" + nameStr + ", employeeId=" + employeeId + ", age=" + age + ", genderStr=" + genderStr + ", startDate=" + startDate + ", levelStr=" + levelStr + ", teamInfoStr=" + teamInfoStr + ", positionTitleStr=" + positionTitleStr + ", photo=" + photo + ", contact=" + contact + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nameStr);
        hash = 83 * hash + this.employeeId;
        hash = 83 * hash + this.age;
        hash = 83 * hash + Objects.hashCode(this.genderStr);
        hash = 83 * hash + Objects.hashCode(this.startDate);
        hash = 83 * hash + Objects.hashCode(this.levelStr);
        hash = 83 * hash + Objects.hashCode(this.teamInfoStr);
        hash = 83 * hash + Objects.hashCode(this.positionTitleStr);
        hash = 83 * hash + Objects.hashCode(this.photo);
        hash = 83 * hash + Objects.hashCode(this.contact);
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
        final Employee other = (Employee) obj;
        if (this.employeeId != other.employeeId) {
            return false;
        }
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.nameStr, other.nameStr)) {
            return false;
        }
        if (!Objects.equals(this.genderStr, other.genderStr)) {
            return false;
        }
        if (!Objects.equals(this.levelStr, other.levelStr)) {
            return false;
        }
        if (!Objects.equals(this.teamInfoStr, other.teamInfoStr)) {
            return false;
        }
        if (!Objects.equals(this.positionTitleStr, other.positionTitleStr)) {
            return false;
        }
        if (!Objects.equals(this.photo, other.photo)) {
            return false;
        }
        if (!Objects.equals(this.startDate, other.startDate)) {
            return false;
        }
        return Objects.equals(this.contact, other.contact);
    }
    
    
        
     
}
