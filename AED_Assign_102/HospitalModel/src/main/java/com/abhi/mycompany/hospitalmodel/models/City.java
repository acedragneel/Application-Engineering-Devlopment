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
    
    private String Name;
    private ArrayList<Community> commDirectory = new ArrayList<>();

    public City(String Name, Community community) {
        this.Name = Name;
        this.commDirectory.add(community);
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList<Community> getCommDirectory() {
        return commDirectory;
    }

    public void setCommDirectory(ArrayList<Community> commDirectory) {
        this.commDirectory = commDirectory;
    }
    
    public Community addNewCommunity(int zipcode, String address, House house){
        Community community = new Community(zipcode,address,house);
        commDirectory.add(community);
        return community;
        
    }
    
    
    
    
}
