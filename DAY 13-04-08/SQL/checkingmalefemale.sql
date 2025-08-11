DROP PROCEDURE IF EXISTS count_genders;

DELIMITER //

CREATE PROCEDURE count_genders(
    OUT male_count INT,
    OUT female_count INT
)
BEGIN
    SELECT COUNT(*) INTO male_count FROM author WHERE gender = 'Male';
    SELECT COUNT(*) INTO female_count FROM author WHERE gender = 'Female';
END //

DELIMITER ;