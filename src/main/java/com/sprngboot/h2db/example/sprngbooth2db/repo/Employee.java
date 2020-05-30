package com.sprngboot.h2db.example.sprngbooth2db.repo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {


    

    @Id
    @GeneratedValue
    private int ID;
    private String firstName;
    private String laststName;
    private String  designation;

    
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLaststName() {
        return laststName;
    }

    public void setLaststName(String laststName) {
        this.laststName = laststName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Employee(int iD, String firstName, String laststName, String designation) {
        ID = iD;
        this.firstName = firstName;
        this.laststName = laststName;
        this.designation = designation;
    }

    

    public Employee() {
    }

    public Employee(String firstName, String laststName, String designation) {
        this.firstName = firstName;
        this.laststName = laststName;
        this.designation = designation;
    }
 

    



    




}