/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.models;

import java.sql.Timestamp;

/**
 *
 * @author abhilashgp
 */
public class Encounter {
    
    Timestamp instant;
    VitalSigns vitalSigns;

    public Encounter(Timestamp instant, VitalSigns vitalSigns) {
        this.instant = instant;
        this.vitalSigns = vitalSigns;
    }
       
    public Encounter(Timestamp instant) {
        this.instant = instant;
    }

    public Timestamp getInstant() {
        return instant;
    }

    public void setInstant(Timestamp instant) {
        this.instant = instant;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    @Override
    public String toString() {
        return "Encounter{" + "instant=" + instant + ", vitalSigns=" + vitalSigns + '}';
    }
    
    
}
