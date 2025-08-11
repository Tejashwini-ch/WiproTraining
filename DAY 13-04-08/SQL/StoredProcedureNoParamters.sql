DELIMITER //

CREATE PROCEDURE display_book()
BEGIN
    SELECT * FROM book;
END //

call display_book();
-- it creates a procedure.