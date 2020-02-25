package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Role;

public interface RoleRepository extends MongoRepository<Role, String>{

	Role findByRole(String role);
}
