/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.hospitalmodel.directory;

import com.abhi.mycompany.hospitalmodel.models.City;
import com.abhi.mycompany.hospitalmodel.models.Community;
import com.abhi.mycompany.hospitalmodel.models.House;
import com.abhi.mycompany.hospitalmodel.models.Person;
import com.abhi.mycompany.hospitalmodel.roles.Roles;
import com.abhi.mycompany.hospitalmodel.userAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

/**
 *
 * @author abhilashgp
 */
public class PersonDirectory {
    
    ArrayList<Person> personDirectory;

    public PersonDirectory() {
        this.personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person authenticateUser(String username, String password){
        for (Person person : personDirectory)
            if (person.getUseraccount().getUsername().equals(username) && person.getUseraccount().getPassword().equals(password)){
                return person;
            }
    return null;
    }
    
    public Person addNewPerson(String Name, int PersonId, String UserRoles, Roles roles, City city, Community community, House house, Date doa, UserAccount userAccount, String GenderString){
        Person person = new Person(Name, PersonId, UserRoles, roles, city, community, house, doa, userAccount, GenderString);
        personDirectory.add(person);
        return person;
    } 
    
    public void deletePersonAccount(Person person){
        
        ListIterator<Person> var = personDirectory.listIterator();

        while (var.hasNext()) {

            if (var.next().equals(person)){
              var.remove();
            }
        }
    }
    
    public Person getPersonAccount(Person person) {

        Person personAccountLocal = null;

        for(Person per : personDirectory){
            if(per.equals(person))
                personAccountLocal =  per;
        }

         return personAccountLocal;
    }

    @Override
    public String toString() {
        return "PersonDirectory{" + "personDirectory=" + personDirectory + '}';
    }
    
    
}
