package com.toad.repositories;

import org.springframework.data.repository.CrudRepository;

import com.toad.entities.Staff;

import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface StaffRepository extends CrudRepository<Staff, Integer> {
    Optional<Staff> findByEmail(String email);
}