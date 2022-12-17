package com.kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.hrms.entities.concretes.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByEmailEquals(String email);

}
