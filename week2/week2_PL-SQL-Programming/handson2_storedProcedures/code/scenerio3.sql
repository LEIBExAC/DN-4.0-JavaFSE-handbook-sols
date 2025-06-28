-- Scenario 3: Customers should be able to transfer funds between their accounts.
--      Question: Write a stored procedure TransferFunds that transfers a specified amount from one account 
--                to another, checking that the source account has sufficient balance before making the transfer.

CREATE OR REPLACE PROCEDURE TransferFunds(
    temp_source_account_id IN NUMBER,
    temp_target_account_id IN NUMBER,
    temp_transfer_amount IN NUMBER
) AS
    v_source_balance NUMBER;
BEGIN
    SELECT balance INTO v_source_balance
    FROM accounts
    WHERE account_id = temp_source_account_id;

    IF v_source_balance >= temp_transfer_amount THEN
        UPDATE accounts
        SET balance = balance - temp_transfer_amount
        WHERE account_id = temp_source_account_id;

        UPDATE accounts
        SET balance = balance + temp_transfer_amount
        WHERE account_id = temp_target_account_id;

        DBMS_OUTPUT.PUT_LINE('Transfer successful! ' || temp_transfer_amount || ' transferred from Account ID ' || temp_source_account_id || ' to Account ID ' || temp_target_account_id);
        
        COMMIT;
    ELSE
        DBMS_OUTPUT.PUT_LINE('Error: Insufficient funds in Account ID ' || temp_source_account_id);
    END IF;
END TransferFunds;

