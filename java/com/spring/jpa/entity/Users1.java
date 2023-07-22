package com.spring.jpa.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@Table (name = "tb_radhika_customer1")

public class Users1 {
	
			
		@Id
		@GeneratedValue(generator="UUID")
		@GenericGenerator(name="UUID", strategy ="org.hibernate.id.UUIDGenerator")
		@Type(type ="uuid-char")
		@Column(name="id_1",updatable=false, nullable=false)
		private UUID id_1;
		
		@Column (name = "name_1")
		private String name_1;
		
		@Column (name = "code_1")
		private String code_1;
		
		@Column (name = "email_1")
		private String email_1;
		
		@Column (name = "phone_1")
		private String phone_1;
		
		@Column (name = "status_1")
		private String status_1;

		public UUID getId_1() {
			return id_1;
		}

		public void setId_1(UUID id_1) {
			this.id_1 = id_1;
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
		
		
}
