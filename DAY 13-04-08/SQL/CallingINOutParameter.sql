-- ALTER TABLE author CHANGE `              gender` gender VARCHAR(6);
CALL count_genders(@M, @F);
SELECT @M AS Male, @F AS Female;