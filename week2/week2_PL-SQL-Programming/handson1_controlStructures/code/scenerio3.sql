-- Scenario 3: The bank wants to send reminders to customers whose loans are due within the next 30 days.
--      Question: Write a PL/SQL block that fetches all loans due in the next 30 days and prints a 
--                reminder message for each customer.

DECLARE
    temp_customer_id NUMBER;
    temp_loan_due_date DATE;
BEGIN
    FOR loan IN (SELECT customer_id, loan_due_date FROM loans
                 WHERE loan_due_date BETWEEN SYSDATE AND SYSDATE + 30) LOOP
        temp_customer_id := loan.customer_id;
        temp_loan_due_date := loan.loan_due_date;
        
        DBMS_OUTPUT.PUT_LINE('Reminder! The Loan for Customer ID ' || temp_customer_id || 
                             ' is due on ' || TO_CHAR(temp_loan_due_date, 'MM-DD-YYYY') || '.');
    END LOOP;
END;
