/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.directory;

import com.abhi.mycompany.hospitalmodel.models.City;
import com.abhi.mycompany.hospitalmodel.models.Community;
import com.abhi.mycompany.hospitalmodel.models.House;
import com.abhi.mycompany.hospitalmodel.models.Patient;
import com.abhi.mycompany.hospitalmodel.roles.Roles;
import com.abhi.mycompany.hospitalmodel.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author abhilashgp
 */
public class PatientDirectory {
    
    ArrayList<Patient> directory;

    public PatientDirectory(ArrayList<Patient> directory) {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Patient> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Patient> directory) {
        this.directory = directory;
    }
    
    public Patient addNewPatient(String name,int patientId, String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount userAccount){
    Patient patient = new Patient(name,patientId, Name, PersonId, UserRoles, roles, city, community, house, doa, userAccount);
    directory.add(patient);
    return patient;
    }

        
}
