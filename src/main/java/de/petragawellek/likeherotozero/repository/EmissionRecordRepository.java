package de.petragawellek.likeherotozero.repository;

import de.petragawellek.likeherotozero.model.EmissionRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmissionRecordRepository
        extends JpaRepository<EmissionRecord, Long> {
}