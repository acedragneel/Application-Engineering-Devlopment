/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.models;

/**
 *
 * @author abhilashgp
 */
public class Doctor{
    
    private String name;
    private int docId;
    private Person person;

    public Doctor(String name, int docId, Person person) {
        this.name = name;
        this.docId = docId;
        this.person = person;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Doctor{" + "name=" + name + ", docId=" + docId + ", person=" + person + '}';
    }
            
}
