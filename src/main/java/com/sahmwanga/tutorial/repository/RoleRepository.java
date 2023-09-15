package com.sahmwanga.tutorial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahmwanga.tutorial.model.ERole;
import com.sahmwanga.tutorial.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);

}
