package com.perenitysoftware.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perenitysoftware.domain.UserRole;

public interface UserRolesRepository extends JpaRepository<UserRole, Long> {

}
