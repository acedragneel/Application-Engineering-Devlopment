/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.directory;

import com.abhi.mycompany.hospitalmodel.models.Hospital;
import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class HospitalDirectory {
    
    ArrayList<Hospital> directory;

    public HospitalDirectory(ArrayList<Hospital> hospital) {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospital() {
        return directory;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.directory = hospital;
    }
    
    public Hospital addNewHospital(String name,int hospitalId){
        Hospital hospital = new Hospital(name,hospitalId);
        directory.add(hospital);
        return hospital;
    }
    
}
