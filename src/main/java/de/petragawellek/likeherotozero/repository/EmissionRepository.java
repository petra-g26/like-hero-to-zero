package de.petragawellek.likeherotozero.repository;

import de.petragawellek.likeherotozero.model.Emission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmissionRepository
        extends JpaRepository<Emission, Long> {

}