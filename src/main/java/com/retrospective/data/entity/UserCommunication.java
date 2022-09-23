package com.retrospective.data.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="T_USER_COMMUNICATION")
public class UserCommunication {

	@Id
	private int id;
	private String type;
	private String value;
	private Date createTime;

	@ManyToOne
	@JoinColumn(name="user_id")
	User user;
}
