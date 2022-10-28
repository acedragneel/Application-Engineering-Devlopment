/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.roles;

/**
 *
 * @author abhilashgp
 */
public class Roles {
    
     public String Admin = "Admin";
     public String Doctor = "Doctor";
     public String Patient = "Patient";
     public String Community = "Community";
     public String Hospital = "Hospital";
     
    public String roleType;

    public Roles() {
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Override
    public String toString() {
        return "Roles{" + "roleType=" + roleType + '}';
    }
   
}
