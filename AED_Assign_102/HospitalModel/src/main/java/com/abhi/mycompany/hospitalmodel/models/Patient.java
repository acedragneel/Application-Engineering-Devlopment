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
public class Patient extends Person{
    
    private String patientName;
    private int patientId;

    public Patient(String patientName, int patientId, String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount userAccount) {
        super(Name, PersonId, UserRoles, roles, city, community, house, doa, userAccount);
        this.patientName = patientName;
        this.patientId = patientId;
    }
    
    
    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "Patient{" + "patientName=" + patientName + ", patientId=" + patientId + '}';
    }
    
    
    
}
