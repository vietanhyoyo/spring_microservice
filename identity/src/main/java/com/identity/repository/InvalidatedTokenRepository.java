package com.identity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.identity.entity.InvalidatedToken;

public interface InvalidatedTokenRepository extends JpaRepository<InvalidatedToken, String> {}
