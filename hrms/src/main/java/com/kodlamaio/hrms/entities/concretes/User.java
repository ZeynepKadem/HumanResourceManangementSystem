package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable = false)
	private int id;
	
	@NotNull
	@NotBlank
	@Column(name="email",nullable = false, unique = true)
	private String email;
	
	@NotNull
	@NotBlank
	@Column(name="password",nullable = false)
	private String password;
}
