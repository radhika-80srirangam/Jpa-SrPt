package com.spring.jpa.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.Users;

	@Repository
	public interface UsersRepository extends CrudRepository<Users, UUID> {
	
	public List<Users> findAllByName (String name);
	
	public Optional<Users> findById(UUID id);

	}
	
