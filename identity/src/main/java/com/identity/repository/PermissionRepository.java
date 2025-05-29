package com.identity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.identity.entity.Permission;

public interface PermissionRepository extends JpaRepository<Permission, String> {}
