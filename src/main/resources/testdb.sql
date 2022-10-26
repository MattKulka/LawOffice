DROP DATABASE IF EXISTS LawOffice;
CREATE DATABASE LawOffice;
USE LawOffice;

CREATE TABLE Attorney (
    id INT AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(45) NOT NULL,
    practice VARCHAR(45) NOT NULL,
    Attorney_type_id VARCHAR(45) NOT NULL,
    Office_id VARCHAR(45) NOT NULL,
    Consultation_id INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Office (
    id INT AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    sq_ft INT NOT NULL,
    staff_num INT NOT NULL,
    Office_Locations_id INT NOT NULL,
    Practice_category_id INT NOT NULL,
    Billing_id INT NOT NULL,
    Courthouse_category_id INT NOT NULL,
    Operating_hours_category_id INT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Payment(
    id INT AUTO_INCREMENT,
    payment_type VARCHAR(50) NOT NULL,
    currency VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Practice (
    id INT AUTO_INCREMENT,
    NAME VARCHAR(45) NOT NULL,
    PRIMARY KEY (id),
);

CREATE TABLE Office_locations(
    id INT AUTO_INCREMENT,
    street VARCHAR(45) NOT NULL,
    city VARCHAR(45) NOT NULL,
    county VARCHAR(45) NOT NULL,
    state VARCHAR(45) NOT NULL,
    zip VARCHAR(45) NOT NULL,
    country VARCHAR(45) NOT NULL,
    PRIMARY KEY (id),
);

CREATE TABLE Office_Locations(
    id INT AUTO_INCREMENT,
    PRIMARY KEY (id)
);

CREATE TABLE Courthouse(
    id INT AUTO_INCREMENT,
    name VARCHAR(100);
    PRIMARY KEY (id)
);

CREATE TABLE Testimonials(
    id INT AUTO_INCREMENT,
    rating VARCHAR(45) NOT NULL,
    PRIMARY KEY (id),


CREATE TABLE Attorney_Type (
    id INT AUTO_INCREMENT,
    traffic_crimes VARCHAR(45) NOT NULL,
    misdemeanor_crimes VARCHAR(45) NOT NULL,
    federal_crimes VARCHAR(45) NOT NULL,
    PRIMARY KEY (id),
);

INSERT INTO Attorney(first_name, last_name, practice, Attorney_type, Office_id, Consultation_id) VALUES
    ('Saul', 'Goodman', 'Misdemeanor', 'Assault Crimes', 'Albuquerque', '100'),
    ('Pete', 'Williams', 'Misdemeanor', 'Drug Crimes', 'Seattle', '200'),
    ('Andrew', 'Shaffer', 'Traffic', 'DUI', 'Los Angeles', '200'),
    ('Matt', 'Moore', 'Traffic', 'Speeding Tickets', 'Boulder', '150'),
    ('Michael', 'Shultz', 'Federal', 'Robbery Crimes', 'Albuquerque', '150'),
    ('Howard', 'Usman', 'Federal', 'Murder Crimes', 'Boulder', '400'),
    ('Sarah', 'Griffin', 'Federal', 'Cyber Crimes', 'Seattle', '250');

