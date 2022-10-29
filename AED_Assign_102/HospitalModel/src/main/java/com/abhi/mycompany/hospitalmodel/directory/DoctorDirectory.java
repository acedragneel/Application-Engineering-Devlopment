/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.directory;

import com.abhi.mycompany.hospitalmodel.models.City;
import com.abhi.mycompany.hospitalmodel.models.Community;
import com.abhi.mycompany.hospitalmodel.models.Doctor;
import com.abhi.mycompany.hospitalmodel.models.Hospital;
import com.abhi.mycompany.hospitalmodel.models.House;
import com.abhi.mycompany.hospitalmodel.roles.Roles;
import com.abhi.mycompany.hospitalmodel.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author abhilashgp
 */
public class DoctorDirectory {
    
    ArrayList<Doctor> directory;

    public DoctorDirectory() {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Doctor> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Doctor> directory) {
        this.directory = directory;
    }
    
    public Doctor addNewDoctor(String docName,int doctorId,String department, String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount userAccount, String GenString){
    Doctor doctor = new Doctor(docName,doctorId,department, Name, PersonId, UserRoles, roles, city, community, house, doa, userAccount, GenString);
    directory.add(doctor);
    return doctor;
    }
}
