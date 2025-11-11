package com.example.Alert_City.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizationRepository extends JpaRepository<AuthorizationRepository, Long> {

}