CREATE TABLE carDetails (
    car_id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    year INT CHECK (year >= 1886)
);
DELIMITER //

CREATE PROCEDURE insertCarDetails(
    IN carBrand VARCHAR(50),
    IN carModel VARCHAR(50),
    IN carYear INT
)
BEGIN
    INSERT INTO carDetails (brand, model, year)
    VALUES (carBrand, carModel, carYear);
END //

DELIMITER ;