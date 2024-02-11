package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity()
@Table(name="admin")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Admin extends BaseEntity{
	
	
	@Column(name="first_name",length = 30)
	private String fName;
	
	@Column(name="last_name",length = 30)
	private String lName;
	
	@Column(name="email", length = 50)
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="contact_no")
	private String contactNo;
}
