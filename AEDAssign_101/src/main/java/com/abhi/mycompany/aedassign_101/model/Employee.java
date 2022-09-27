package com.abhi.mycompany.aedassign_101.model;

import java.text.DateFormat;

public class Employee {
	
	private String nameStr;
	private int employeeId;
	private int age;
	private String genderStr;
	private DateFormat startDate;
	private String levelStr;
	private String teamInfoStr;
	private String positionTitleStr;

	private Contact contact = new Contact();
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String nameStr, int employeeId, int age, String genderStr, DateFormat startDate, String levelStr,
			String teamInfoStr, String positionTitleStr) {
		super();
		this.nameStr = nameStr;
		this.employeeId = employeeId;
		this.age = age;
		this.genderStr = genderStr;
		this.startDate = startDate;
		this.levelStr = levelStr;
		this.teamInfoStr = teamInfoStr;
		this.positionTitleStr = positionTitleStr;
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

	public DateFormat getStartDate() {
		return startDate;
	}

	public void setStartDate(DateFormat startDate) {
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
	
	
	
}
