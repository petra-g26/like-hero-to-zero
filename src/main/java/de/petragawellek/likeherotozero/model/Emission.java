package de.petragawellek.likeherotozero.model;
import jakarta.persistence.*;
@Entity
public class Emission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer year;
    private Double co2Value;
    @ManyToOne
    private Country country;
    public Emission() {
    }
    public Emission(Integer year, Double co2Value, Country country) {
        this.year = year;
        this.co2Value = co2Value;
        this.country = country;
    }
    public Long getId() {
        return id;
    }
    public Integer getYear() {
        return year;
    }
    public Double getCo2Value() {
        return co2Value;
    }
    public Country getCountry() {
        return country;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public void setCo2Value(Double co2Value) {
        this.co2Value = co2Value;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
}