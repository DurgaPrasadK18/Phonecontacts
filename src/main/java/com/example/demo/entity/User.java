package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contactdetails")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotBlank
	@NotNull
	private String houseno;
	@NotBlank
	@NotNull
	@Size(max = 50)
	private String street;
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String city;
	@NotBlank
	@NotNull
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 7)
	private String pincode;
	@NotNull
	@Size(max = 10)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String firstname;
	@NotNull
	@Size(max = 10)
	@Pattern(regexp ="^[a-zA-Z\s]+$")
	private String lastname;
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	private String age;
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHouseNo() {
		return houseno;
	}

	public void setHouseNo(String houseno) {
		this.houseno = houseno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	
	

}
