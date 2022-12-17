package com.kodlamaio.hrms.entities.concretes;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name="verification_code_candidates")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class VerificationCodeCandidates extends VerificationCode {

	@OneToOne(cascade = CascadeType.MERGE)	
	// CascadeType.MERGE -> VerificationCode için aday oluşturduktan sonra db ye eklenebilir.
	@JoinColumn(name = "candidate_id", referencedColumnName = "id")
	@JsonManagedReference
	private Candidate candidate;
}
