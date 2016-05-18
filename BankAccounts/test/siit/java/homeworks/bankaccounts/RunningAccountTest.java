/**
 * This class is a test class for the {@link RunningAccount} class.
 * <p>
 * @author Adelina Cujba
 */
package siit.java.homeworks.bankaccounts;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class RunningAccountTest {

	// TODO CODE REVIEW: This test is not working
	@Test
	public void whenMultipleOperationsCalled_balanceIsCorrect() throws InsufficientFundsException {
		// given
		float monthlyFee = 5;
		Date accountCreationDate = TestUtils.getDate(2016, 1, 1);
		float credit = 800;
		RunningAccount runningAccount = new RunningAccount(accountCreationDate, monthlyFee, credit);

		// when
		runningAccount.withdrawFunds(50);
		runningAccount.withdrawFunds(100);
		runningAccount.addFunds(80);
		Date balanceInterogationTime = TestUtils.getDate(2016, 5, 1);
		float actualBalance = runningAccount.getBalance(balanceInterogationTime);

		// then
		float withdrawalsAndAdds = credit - 50 - 100 + 80;
		// TODO CODE REVIEW: you are not using this variable. Not a good practice. Wither use it, or delete it.
		float expectedBalanceAfterOperations = credit - withdrawalsAndAdds;

		assertEquals("4 months worth of withdrawals and adds have been deducted.", 730,
				actualBalance, 0);
	}

}
