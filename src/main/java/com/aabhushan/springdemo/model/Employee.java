package com.aabhushan.springdemo.model;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;



public class Employee {
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private String companyName;
	private String post;
	private int salary;
	private Date dob;
	private Date joinDate;
	private String email;
	private String phone;
	private Address address;
	private Set<String> project;
}
