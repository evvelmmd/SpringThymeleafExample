package com.company.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "gender")
	private String gender;
	@Column(name = "note")
	private String note;
	@Column(name = "married")
	private boolean married;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "profession")
	private String profession;


}
