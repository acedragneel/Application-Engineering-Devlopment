/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.models;

import com.abhi.mycompany.hospitalmodel.roles.Roles;
import com.abhi.mycompany.hospitalmodel.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author abhilashgp
 */
public class Doctor extends Person{
    
    private String doctorName;
    private int docId;
    private String Department;
    private Hospital hospital;
    private ArrayList<Patient> patientDir= new ArrayList<>();

    public Doctor(String doctorName, int docId, String Department, String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount useraccount, String Gender) {
        super(Name, PersonId, UserRoles, roles, city, community, house, doa, useraccount, Gender);
        this.doctorName = doctorName;
        this.docId = docId;
        this.Department = Department;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
    
    

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    @Override
    public String toString() {
        return "Doctor{" + "doctorName=" + doctorName + ", docId=" + docId + ", Department=" + Department + '}';
    }
        
}
