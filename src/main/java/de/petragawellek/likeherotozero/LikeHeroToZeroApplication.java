package de.petragawellek.likeherotozero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("de.petragawellek.likeherotozero.model")
@EnableJpaRepositories("de.petragawellek.likeherotozero.repository")
public class LikeHeroToZeroApplication {

    public static void main(String[] args) {
        SpringApplication.run(LikeHeroToZeroApplication.class, args);
    }

}