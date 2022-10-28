 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.models;

import com.abhi.mycompany.hospitalmodel.roles.Roles;
import com.abhi.mycompany.hospitalmodel.userAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author abhilashgp
 */
public class Person {
    
    private String Name;
    private int PersonId;
    private String UserRoles;
    private Roles roles;
    private City city;
    private Community community;
    private House house;
    private Date doa;
    private UserAccount useraccount;

    public Person(String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount userAccount) {
        this.Name = Name;
        this.PersonId = PersonId;
        this.UserRoles = UserRoles;
        this.roles = roles;
        this.city = city;
        this.community = community;
        this.house = house;
        this.doa = doa;
        this.useraccount = userAccount;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPersonId() {
        return PersonId;
    }

    public void setPersonId(int PersonId) {
        this.PersonId = PersonId;
    }

    public String getUserRoles() {
        return UserRoles;
    }

    public void setUserRoles(String UserRoles) {
        this.UserRoles = UserRoles;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Date getDoa() {
        return doa;
    }

    public void setDoa(Date doa) {
        this.doa = doa;
    }

    public UserAccount getUseraccount() {
        return useraccount;
    }

    public void setUseraccount(UserAccount useraccount) {
        this.useraccount = useraccount;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", PersonId=" + PersonId + ", UserRoles=" + UserRoles + ", roles=" + roles + ", city=" + city + ", community=" + community + ", house=" + house + ", doa=" + doa + ", useraccount=" + useraccount + '}';
    }
    
}
