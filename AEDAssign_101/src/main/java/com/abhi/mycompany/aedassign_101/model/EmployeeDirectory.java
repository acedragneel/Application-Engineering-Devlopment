/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abhi.mycompany.aedassign_101.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


/**
 *
 * @author Abhilash Gowdru Palakshappa
 */
public class EmployeeDirectory {
    
    public ArrayList<Employee> directory = new ArrayList<Employee>();

    public EmployeeDirectory() {
//        this.directory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getDirectorty() {
        return directory;
    }

    public void setDirectorty(ArrayList<Employee> directorty) {
        this.directory = directorty;
    }
    
    public Employee addNewEmployee(){
        Employee employee = new Employee();
        this.directory.add(employee);
        return employee;
    }  

    @Override
    public String toString() {
        return "EmployeeDirectory{" + "directorty=" + directory + '}';
    }
    
    public void deleteEmployee(Employee employee) {
        
        ListIterator<Employee> var = directory.listIterator();
        
         while (var.hasNext()) {
 
              if(var.next().equals(employee)){
                  var.remove();
              }
        }
    }
    
        public Employee getEmployee(Employee employee) {
                
        Employee employeeOther = null;
        
        for(Employee emp : directory){
            if(emp.equals(employee))
                employeeOther =  emp;
        }
                       
         return employeeOther;
    }
}
