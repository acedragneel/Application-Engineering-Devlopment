/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.directory;

import com.abhi.mycompany.hospitalmodel.models.Doctor;
import com.abhi.mycompany.hospitalmodel.models.Person;
import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class DoctorDirectory {
    
    ArrayList<Doctor> directory;

    public DoctorDirectory(ArrayList<Doctor> directory) {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Doctor> directory) {
        this.directory = directory;
    }
    
    public Doctor addNewHospital(String name,int doctorId,Person person){
    Doctor doctor = new Doctor(name,doctorId,person);
    directory.add(doctor);
    return doctor;
    }
}
