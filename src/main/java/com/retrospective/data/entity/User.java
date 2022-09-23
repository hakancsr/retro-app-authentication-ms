package com.retrospective.data.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "T_USER")
//@Where(clause = "DELETED = '0'") 
public class User {

	@Id
	private int id;
	private String password;
	private String firstName;
	private String lastName;
	private String userName;
	private Date createTime;

}
