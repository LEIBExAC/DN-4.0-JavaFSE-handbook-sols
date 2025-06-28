-- Scenario 1: The bank wants to apply a discount to loan interest rates for customers above 60 years old.
--      Question: Write a PL/SQL block that loops through all customers, checks their age, and if they are above
--                60, apply a 1% discount to their current loan interest rates.

DECLARE
    temp_customer_id NUMBER;
    temp_age NUMBER;
    temp_interest_rate NUMBER;
BEGIN
    FOR customer IN (SELECT customer_id, age, loan_interest_rate FROM customers) LOOP
        temp_customer_id := customer.customer_id;
        temp_age := customer.age;
        temp_interest_rate := customer.loan_interest_rate;
        
        IF temp_age > 60 THEN
            temp_interest_rate := temp_interest_rate - 0.01;
            
            UPDATE customers
            SET loan_interest_rate = temp_interest_rate
            WHERE customer_id = temp_customer_id;
            
            DBMS_OUTPUT.PUT_LINE('Customer ID: ' || temp_customer_id || ' - New Interest Rate: ' || temp_interest_rate);
        END IF;
    END LOOP;
    
    COMMIT;
END;
