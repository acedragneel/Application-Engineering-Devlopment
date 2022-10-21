/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.roles;

import com.abhi.mycompany.hospitalmodel.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author abhilashgp
 */
public class Roles {
    
     public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        Patient("Patient"),
        Community("Community");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
     
    public RoleType type;

    @Override
    public String toString() {
        return (type != null) ? this.type.getValue() : this.getClass().getName();
    }
}
