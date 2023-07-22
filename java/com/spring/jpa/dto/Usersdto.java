package com.spring.jpa.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.spring.jpa.entity.Users;
import com.spring.jpa.entity.Users1;

public class Usersdto {
	
	
	
	private String name;
	
	private String code;
	
	private String email;
	
	private String phone;
	
	private String contact_person_name;
	
	private String contact_person_phone;
	
	private String status;
	
	private String created_by;
	
	private String modified_by;
	
	private LocalDateTime created_date;
	
	private LocalDateTime modified_date;
	
	private String name_1;
	
	private String code_1;
	
	private String email_1;
	
	private String phone_1;
	
	private String status_1;
	
	Iterable<Users> details;
	Iterable<Users1>details2;

	public Iterable<Users> getDetails() {
		return details;
	}

	public void setDetails(Iterable<Users> details) {
		this.details = details;
	}

	public Iterable<Users1> getDetails2() {
		return details2;
	}

	public void setDetails2(Iterable<Users1> details2) {
		this.details2 = details2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContact_person_name() {
		return contact_person_name;
	}

	public void setContact_person_name(String contact_person_name) {
		this.contact_person_name = contact_person_name;
	}

	public String getContact_person_phone() {
		return contact_person_phone;
	}

	public void setContact_person_phone(String contact_person_phone) {
		this.contact_person_phone = contact_person_phone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public LocalDateTime getModified_date() {
		return modified_date;
	}

	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}

	

	public String getName_1() {
		return name_1;
	}

	public void setName_1(String name_1) {
		this.name_1 = name_1;
	}

	public String getCode_1() {
		return code_1;
	}

	public void setCode_1(String code_1) {
		this.code_1 = code_1;
	}

	public String getEmail_1() {
		return email_1;
	}

	public void setEmail_1(String email_1) {
		this.email_1 = email_1;
	}

	public String getPhone_1() {
		return phone_1;
	}

	public void setPhone_1(String phone_1) {
		this.phone_1 = phone_1;
	}

	public String getStatus_1() {
		return status_1;
	}

	public void setStatus_1(String status_1) {
		this.status_1 = status_1;
	}

	public static List<Users> savaAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void getAll() {
		// TODO Auto-generated method stub
		
	}

			

}
