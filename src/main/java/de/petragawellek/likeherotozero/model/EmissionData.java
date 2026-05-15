package de.petragawellek.likeherotozero.model;
public class EmissionData {
    private String country;
    private Integer year;
    private Double co2;
    public EmissionData(String country, Integer year, Double co2) {
        this.country = country;
        this.year = year;
        this.co2 = co2;
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
}