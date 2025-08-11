DELIMITER //

CREATE PROCEDURE update_price (
    IN temp_ISBN VARCHAR(10),
    IN new_price INT
)
BEGIN
    UPDATE book SET price = new_price WHERE ISBN = temp_ISBN;
END //

DELIMITER ;

-- Now call the procedure correctly
CALL update_price('001', 600);