package de.petragawellek.likeherotozero.config;
import de.petragawellek.likeherotozero.model.Emission;
import de.petragawellek.likeherotozero.repository.EmissionRepository;
import de.petragawellek.likeherotozero.model.Country;
import de.petragawellek.likeherotozero.repository.CountryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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

    countryRepository.save(new Country("Deutschland"));
    countryRepository.save(new Country("Frankreich"));
    countryRepository.save(new Country("USA"));
    //emissionRepository.save(new Emission("Deutschland", 2022, 600.5));
    }
}