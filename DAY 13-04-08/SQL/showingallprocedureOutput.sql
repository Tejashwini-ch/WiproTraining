-- SHOW PROCEDURE STATUS WHERE Db = 'java_selenium';
CALL disp_gender(@M, 'Male');
CALL disp_gender(@F, 'Female');
CALL disp_max(@Max);

SELECT @M AS Male_Count, @F AS Female_Count, @Max AS Max_Price;