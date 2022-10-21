/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.directory;

import com.abhi.mycompany.hospitalmodel.models.City;
import com.abhi.mycompany.hospitalmodel.models.Community;
import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class CityDirectory {
    
    private ArrayList<City> cityDirectory;

    public CityDirectory(ArrayList<City> city) {
        this.cityDirectory = city;
    }

    public ArrayList<City> getCity() {
        return cityDirectory;
    }

    public void setCity(ArrayList<City> city) {
        this.cityDirectory = city;
    }
    
    public City addNewCity(String cityName,Community community){
        City city = new City(cityName,community);
        cityDirectory.add(city);
        return city;
    }
    
}
