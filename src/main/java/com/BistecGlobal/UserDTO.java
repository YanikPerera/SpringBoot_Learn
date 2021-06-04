package com.BistecGlobal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

// as below the code we can create a entity with the database values
// first we should have mention the table name,, the table name is not in the database it will create automatically 
@Entity
@Table (name = "user")
public class UserDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	@Column(name = "user_id")
	private Integer id;
	@NotNull
	@Column(name = "frist_name")
	private String firstName;
	@NotNull
	@Column(name = "last_name")
	private String lastName;
	@NotNull
	@Column(name = "age")
	private Integer age;
	@NotNull
	@Column(name = "email")
	private String email;
	
	//getter and setter we are basically use for access the data,bcz in java we don't direct call the programmer values
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
