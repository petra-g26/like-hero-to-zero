package de.petragawellek.likeherotozero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "de.petragawellek.likeherotozero.model")
public class LikeHeroToZeroApplication {

    public static void main(String[] args) {
        SpringApplication.run(LikeHeroToZeroApplication.class, args);
    }

}