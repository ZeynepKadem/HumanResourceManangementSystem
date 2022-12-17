package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employees")
@Data
@AllArgsConstructor 
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class Employee {
	
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
	@NotNull
	@NotBlank
	private String firstName;
	
	@Column(name="last_name", nullable =false)
	@NotNull
	@NotBlank
	private String lastName;

}
