package de.petragawellek.likeherotozero.config;

import de.petragawellek.likeherotozero.model.Country;
import de.petragawellek.likeherotozero.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CountryRepository countryRepository;
       public DataLoader(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;

    }
    @Override
    public void run(String... args) {
        Country deutschland =
                countryRepository.save(new Country("Deutschland"));
        Country frankreich =
                countryRepository.save(new Country("Frankreich"));
        Country usa =
                countryRepository.save(new Country("USA"));


    }
}