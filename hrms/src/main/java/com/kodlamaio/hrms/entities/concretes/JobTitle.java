package com.kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="job_titles")
@AllArgsConstructor
@NoArgsConstructor
public class JobTitle {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id",nullable = false)
	private int id;
	
	@Column(name="title",nullable = false)
	private String title;
}
