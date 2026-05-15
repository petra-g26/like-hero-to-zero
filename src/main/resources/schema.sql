CREATE TABLE IF NOT EXISTS emission_record (
                                               id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                               country VARCHAR(255),
    emission_year INTEGER,
    co2 DOUBLE
    );