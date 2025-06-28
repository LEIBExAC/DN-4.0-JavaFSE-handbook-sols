-- Scenario 2: The bank wants to implement a bonus scheme for employees based on their performance.
--      Question: Write a stored procedure UpdateEmployeeBonus that updates the salary of employees
--                in a given department by adding a bonus percentage passed as a parameter.

CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    temp_department_name IN VARCHAR2,
    temp_bonus_percentage IN NUMBER
) AS
BEGIN
    FOR employee IN (SELECT employee_id, salary FROM employees WHERE department = temp_department_name) LOOP
        UPDATE employees
        SET salary = salary * (1 + temp_bonus_percentage / 100)
        WHERE employee_id = employee.employee_id;
        
        DBMS_OUTPUT.PUT_LINE('Employee ID: ' || employee.employee_id || ' - New Salary: ' || employee.salary * (1 + temp_bonus_percentage / 100));
    END LOOP;

    COMMIT;
END UpdateEmployeeBonus;
