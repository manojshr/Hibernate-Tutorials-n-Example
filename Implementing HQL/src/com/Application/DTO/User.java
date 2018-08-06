package com.Application.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_CRUD")
public class User {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String liscense;
    
    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }
    
    public String toString() {
	
	return "Id: " + this.id + " , Name: " + this.name ;
    }

    public String getLiscense() {
	return liscense;
    }

    public void setLiscense(String liscense) {
	this.liscense = liscense;
    }

}
