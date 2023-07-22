package com.spring.jpa.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.Users1;


@Repository
public interface Users1Repository extends CrudRepository<Users1, UUID> {

	

}
