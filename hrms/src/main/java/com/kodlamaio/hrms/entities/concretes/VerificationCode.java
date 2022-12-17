package com.kodlamaio.hrms.entities.concretes;

import java.util.Date;

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
@Table(name="verification_codes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerificationCode {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable = false)
	@NotNull
	@NotBlank
	private int id;
	
	@Column(name="code",nullable = false)
	@NotNull
	@NotBlank
	private String code;
	
	@Column(name="is_verified",nullable = false)
	@NotNull
	@NotBlank
	private boolean isVerified;
	
	@Column(name="verified_date",nullable = false)
	@NotNull
	@NotBlank
	private Date verifiedDate;
	
}
