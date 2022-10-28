/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.directory;

import com.abhi.mycompany.hospitalmodel.models.Encounter;
import com.abhi.mycompany.hospitalmodel.models.VitalSigns;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author abhilashgp
 */
public class EncounterDirectory {
    
    ArrayList<Encounter> directory;

    public EncounterDirectory(ArrayList<Encounter> directory) {
        this.directory = new ArrayList<>();
    }

    public ArrayList<Encounter> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Encounter> directory) {
        this.directory = directory;
    }
    
    public Encounter addNewEncounter(Timestamp timestamp,VitalSigns vitalSigns){
    Encounter encounter = new Encounter(timestamp,vitalSigns);
    directory.add(encounter);
    return encounter;
    }
}
