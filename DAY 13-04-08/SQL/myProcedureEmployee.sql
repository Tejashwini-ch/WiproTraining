DELIMITER //

CREATE PROCEDURE myProcedure (
    IN empId INT,
    IN empName VARCHAR(30),
    IN empSalary INT
)
BEGIN
    INSERT INTO Employee(empId, empName, empSalary)
    VALUES (empId, empName, empSalary);
END //

DELIMITER ;