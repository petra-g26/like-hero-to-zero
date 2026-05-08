package de.petragawellek.likeherotozero.config;

import de.petragawellek.likeherotozero.model.Country;
import de.petragawellek.likeherotozero.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import de.petragawellek.likeherotozero.model.Emission;
import de.petragawellek.likeherotozero.repository.EmissionRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final CountryRepository countryRepository;
    private final EmissionRepository emissionRepository;

    public DataLoader(CountryRepository countryRepository,
                      EmissionRepository emissionRepository) {
        this.countryRepository = countryRepository;
        this.emissionRepository = emissionRepository;
    }

    @Override
    public void run(String... args) {
        Country deutschland =
                countryRepository.save(new Country("Deutschland"));
        Country frankreich =
                countryRepository.save(new Country("Frankreich"));
        Country usa =
                countryRepository.save(new Country("USA"));
        emissionRepository.save(
                new Emission(2022, 600.5, deutschland));
        emissionRepository.save(
                new Emission(2022, 450.2, frankreich));
        emissionRepository.save(
                new Emission(2022, 1200.8, usa));

    }
}