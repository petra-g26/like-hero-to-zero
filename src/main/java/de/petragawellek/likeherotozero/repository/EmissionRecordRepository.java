package de.petragawellek.likeherotozero.repository;

import de.petragawellek.likeherotozero.model.EmissionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EmissionRecordRepository
        extends JpaRepository<
        EmissionRecord, Long> {
    EmissionRecord findTopByCountryOrderByYearDesc(
            String country
    );
@Query("""
SELECT DISTINCT e.country
FROM EmissionRecord e
""")
List<String> findDistinctCountries();
}