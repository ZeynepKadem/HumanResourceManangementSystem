package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="candidates")
@Data
@AllArgsConstructor 
@NoArgsConstructor
public class Candidate {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable =false)
	private int id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable=false, referencedColumnName = "id")
	@OnDelete(action=OnDeleteAction.CASCADE)//bir user silindiğinde bütün postaları sil
	@JsonIgnore //bu alanla işimiz yok demiş oluyoruz
    User user;
	
	@Column(name="first_name", nullable =false)
	private String firstName;
	
	@Column(name="last_name", nullable =false)
	private String lastName;
	
	@Size(min=11, max=11)
	@Column(name="identity_number", nullable =false, unique = true)
	private int identityNumber;
	
	@Column(name="birth_year", nullable =false)
	private int birthYear;
	
}
