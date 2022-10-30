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
    private int weight;

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "VitalSigns{" + "heartRate=" + heartRate + ", bloodPressure=" + weight + '}';
    }
    
    
        
}
