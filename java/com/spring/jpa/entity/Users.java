package com.spring.jpa.entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table (name = "tb_radhika_customer")
public class Users {
		
	@Id
	@GeneratedValue(generator="UUID")
	@GenericGenerator(name="UUID", strategy ="org.hibernate.id.UUIDGenerator")
	@Type(type ="uuid-char")
	@Column(name="id",updatable=false, nullable=false)
	private UUID id;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "code")
	private String code;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "phone")
	private String phone;
	
	@Column (name = "contact_person_name")	
	private String contact_person_name;
	
	@Column (name = "contact_person_phone")	
	private String contact_person_phone;
	
	@Column (name = "status")
	private String status;
	
	@Column (name = "created_by")
	private String created_by;
	
	@Column (name = "modified_by")
	private String modified_by;
	
	@Column (name = "created_date")
	private LocalDateTime created_date;
	
	@Column (name = "modified_date")
	private LocalDateTime modified_date;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public static List<Users> savaAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

		

}
