/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.models;

/**
 *
 * @author abhilashgp
 */
public class VitalSigns {
    
    private int heartRate;
    private int bloodPressure;

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "VitalSigns{" + "heartRate=" + heartRate + ", bloodPressure=" + bloodPressure + '}';
    }
    
    
        
}
