package de.petragawellek.likeherotozero.config;
import de.petragawellek.likeherotozero.repository.EmissionRepository;
import de.petragawellek.likeherotozero.model.Country;
import de.petragawellek.likeherotozero.repository.CountryRepository;
import de.petragawellek.likeherotozero.model.EmissionRecord;
import de.petragawellek.likeherotozero.repository.EmissionRecordRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CountryRepository countryRepository;
    private final EmissionRecordRepository emissionRepository;
    public DataLoader(CountryRepository countryRepository,
                      EmissionRecordRepository emissionRepository) {

        this.countryRepository = countryRepository;
        this.emissionRepository = emissionRepository;


    }
@Override
public void run(String... args) {
    countryRepository.save(new Country("Deutschland"));
    countryRepository.save(new Country("Frankreich"));
    countryRepository.save(new Country("USA"));
    emissionRepository.save(
            new EmissionRecord(
                    "Deutschland",
                    2020,
                    644.5
            )
    );
    emissionRepository.save(
            new EmissionRecord(
                    "USA",
                    2020,
                    4713.0
            )
    );
    emissionRepository.save(
            new EmissionRecord(
                    "China",
                    2020,
                    10668.9
            )
    );
    emissionRepository.save(
            new EmissionRecord(
                    "Indien",
                    2020,
                    2441.8
            )
    );
    emissionRepository.save(
            new EmissionRecord(
                    "Frankreich",
                    2020,
                    306.8
            )
    );
    }
}