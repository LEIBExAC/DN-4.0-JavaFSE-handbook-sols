import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {
    /**
     * In this I have tried to initialize a bank account with a fix balance and after every test
     * the account(Balance) resets.
     */
    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount();
        account.deposit(1000);
        System.out.println("Account initialized with balance 1000.");
    }

    @After
    public void tearDown() {
        account = new BankAccount();
        System.out.println("Account reset.");
    }

    @Test
    public void testDeposit() {
        account.deposit(500);
        assertEquals(1500, account.getBalance(), 0);
    }

    @Test
    public void testWithdraw() {
        account.withdraw(200);
        assertEquals(800, account.getBalance(), 0);
    }

    @Test
    public void testWithdraw_InsufficientBalance() {
        account.withdraw(1500);
        assertEquals(1000, account.getBalance(), 0);
    }

    @Test
    public void testDeposit_InvalidAmount() {
        account.deposit(-100);
        assertEquals(1000, account.getBalance(), 0);
    }
}
