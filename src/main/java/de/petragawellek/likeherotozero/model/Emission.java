package de.petragawellek.likeherotozero.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Emission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String countryName;
    private Integer year;
    private Double co2Value;
    public Emission() {
    }
    public Emission(String countryName,
                    Integer year,
                    Double co2Value) {
        this.countryName = countryName;
        this.year = year;
        this.co2Value = co2Value;
    }
    public Long getId() {
        return id;
    }
    public String getCountryName() {
        return countryName;
    }
    public Integer getYear() {
        return year;
    }
    public Double getCo2Value() {
        return co2Value;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public void setCo2Value(Double co2Value) {
        this.co2Value = co2Value;
    }
}