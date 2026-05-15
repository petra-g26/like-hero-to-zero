package de.petragawellek.likeherotozero.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmissionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private Integer year;
    private Double co2;
    public EmissionRecord() {
    }
    public EmissionRecord(
            String country,
            Integer year,
            Double co2) {
        this.country = country;
        this.year = year;
        this.co2 = co2;
    }
    public Long getId() {
        return id;
    }
    public String getCountry() {
        return country;
    }
    public Integer getYear() {
        return year;
    }
    public Double getCo2() {
        return co2;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public void setCo2(Double co2) {
        this.co2 = co2;
    }
}