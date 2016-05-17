/**
 * This class models a Loan Account that is also a {@link BankAccount}.
 * <p>
 * It is used to store loans and has installments, interest and a deadline.
 * <p>
 * @author Adelina Cujba
 */
package siit.java.homeworks.bankaccounts;

import java.util.Calendar;
import java.util.Date;

public class LoanAccount extends BankAccount {
	private float interest;
	private float installment;

	public LoanAccount(Date accountCreationDate, float monthlyFee, float interest, float installment) {
		super(accountCreationDate, 0);
		this.interest = interest;
		this.installment = installment;
	}

	@Deprecated
	@Override
	public void withdrawFunds(float amount) throws InsufficientFundsException {
		throw new UnsupportedOperationException();
	}

	@Override
	public float getBalance(Date balanceDate) {
		float balance = super.getBalance(balanceDate);
		return getBalanceWithInterest(balance);
	}

	private float getBalanceWithInterest(float balance) {
		return balance + balance * interest;

	}

	// public float getBalance(Date balanceDate, float installment) {
	// Object deadline = null;
	// if (balanceDate > deadline){
	// throw new UnsupportedOperationException();
	// } else {
	// return getBalanceWithInstallmentWithdrawn(balance, balanceDate);
	// }
	// }

	private float getBalanceWithInstallmentWithdrawn(float balance, Date balanceDate) {
		Calendar accountCreationTime = Calendar.getInstance();
		accountCreationTime.setTime(accountCreationDate);
		int accountCreationMonth = accountCreationTime.get(Calendar.MONTH);
		Calendar balanceTime = Calendar.getInstance();
		balanceTime.setTime(balanceDate);
		int currentMonth = balanceTime.get(Calendar.MONTH);
		return balance - installment * (currentMonth - accountCreationMonth);
	}
	/**
	 * This method is used to return the balance of the account after the
	 * installments where extracted.
	 */

}
