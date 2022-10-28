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
public class Community {
    
    private String CommunityName;
    private int zipCode;
    private String Address;
    private ArrayList<House> housesDirectory = new ArrayList<>();

    public Community(int zipCode, String Address, House house) {
        this.zipCode = zipCode;
        this.Address = Address;
        this.housesDirectory.add(house);
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public ArrayList<House> getHousesDirectory() {
        return housesDirectory;
    }

    public void setHousesDirectory(ArrayList<House> housesDirectory) {
        this.housesDirectory = housesDirectory;
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void setCommunityName(String CommunityName) {
        this.CommunityName = CommunityName;
    }
      
    public House addNewHouse(String houseName){
        House house = new House(houseName);
        housesDirectory.add(house);
        return house;
    }

    @Override
    public String toString() {
        return "Community{" + "zipCode=" + zipCode + ", Address=" + Address + '}';
    }
       
   
}
