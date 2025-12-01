package com.example.Alert_City.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Alert_City.model.AttachmentModel;

@Repository
public interface AttachmentRepository extends JpaRepository<AttachmentModel, Long> {
}
