-- Scenario 1: The bank needs to process monthly interest for all savings accounts.
--      Question: Write a stored procedure ProcessMonthlyInterest that calculates and updates the balance of 
--                all savings accounts by applying an interest rate of 1% to the current balance.

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    FOR account IN (SELECT account_id, balance FROM accounts WHERE account_type = 'Savings') LOOP
        UPDATE accounts
        SET balance = balance * 1.01
        WHERE account_id = account.account_id;
        
        DBMS_OUTPUT.PUT_LINE('Account ID: ' || account.account_id || ' - New Balance: ' || account.balance * 1.01);
    END LOOP;

    COMMIT;
END ProcessMonthlyInterest;

