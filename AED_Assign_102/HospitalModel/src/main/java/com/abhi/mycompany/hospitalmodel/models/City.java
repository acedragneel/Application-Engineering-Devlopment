/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.models;

import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class City {
    
    private String States;
    private String Cities;
    private ArrayList<Community> commDirectory = new ArrayList<>();
    private Community community;
    
    public City(String Name, String Cities, Community community) {
        this.States = Name;
        this.Cities = Cities;
        this.commDirectory.add(community);
        this.community = community;
    }

    public String getCities() {
        return Cities;
    }

    public void setCities(String Cities) {
        this.Cities = Cities;
    }
    
    public String getStates() {
        return States;
    }

    public void setStates(String Name) {
        this.States = Name;
    }

    public ArrayList<Community> getCommDirectory() {
        return commDirectory;
    }

    public void setCommDirectory(ArrayList<Community> commDirectory) {
        this.commDirectory = commDirectory;
    }
    
    public Community getCommunity(){
        return community;
    }
    
    public Community addNewCommunity(int zipcode, String address, House house){
        Community community = new Community(zipcode,address,house);
        commDirectory.add(community);
        return community;
        
    }

    @Override
    public String toString() {
        return "City{" + "States=" + States + ", Cities=" + Cities + '}';
    }
       
}
