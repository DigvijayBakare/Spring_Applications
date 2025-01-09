package com.concretepage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;



@Entity
@Table(name= "person")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="pid")
    private int pid;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "city")
    private String city;

	public int getPid() {
	  return pid;
	}

	public void setPid(int pid) {
	  this.pid = pid;
	}

	public String getName() {
	  return name;
	}

	public void setName(String name) {
	  this.name = name;
	}

	public String getCity() {
	  return city;
	}

	public void setCity(String city) {
	  this.city = city;
	}	
}
