-- Scenario 2: A customer can be promoted to VIP status based on their balance.
--      Question: Write a PL/SQL block that iterates through all customers and sets a flag
--                IsVIP to TRUE for those with a balance over $10,000.

DECLARE
    temp_customer_id NUMBER;
    temp_balance NUMBER;
BEGIN
    FOR customer IN (SELECT customer_id, balance FROM customers) LOOP
        temp_customer_id := customer.customer_id;
        temp_balance := customer.balance;
        
        IF temp_balance > 10000 THEN
            UPDATE customers
            SET is_vip = 'TRUE'
            WHERE customer_id = temp_customer_id;
            
            DBMS_OUTPUT.PUT_LINE('Customer ID: ' || temp_customer_id || ' is now a VIP.');
        END IF;
    END LOOP;
    
    COMMIT;
END;
