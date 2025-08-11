DELIMITER //

CREATE PROCEDURE disp_gender(
    INOUT mfgender INT,
    IN emp_gender VARCHAR(6)
)
BEGIN
    SELECT COUNT(*) INTO mfgender
    FROM author
    WHERE gender = emp_gender;
END //

DELIMITER ;

-- Call the procedure
CALL disp_gender(@M, 'Male');
SELECT @M;

CALL disp_gender(@F, 'Female');
SELECT @F;