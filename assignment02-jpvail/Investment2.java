package assignment02;


public class Investment2 {
	private double balance;
	private double rate;
	private int year;

	/**
	 * Constructs an Investment object from a starting balance and
	 * interest rate.
	 * @param aBalance the starting balance
	 * @param aRate the interest rate in percent
	 */
	public Investment2(double aBalance, double aRate) {
		balance = aBalance;
		rate = aRate;
		year = 0;
	}

	
	/**
	 * Creates local copies of balance and year, and returns copy of year that
	 * indicates # of years until the target balance is reached
	 *
	 */
	public int yearsToBalance(double targetBalance) 	{
		int year1 = year; 
		double balance1 = balance; 
	
		while (balance1 < targetBalance) {
			year1++;   
			double interest = balance1 * rate / 100;
			balance1 += interest;
		}
		return year1; 
	}

	/**
	 * Keeps accumulating interest for a given number of years.
	 * @param numberOfYears the number of years to wait
	 */
	public void waitYears(int numberOfYears) {
		for (int i = 1; i <= numberOfYears; i++) {
			double interest = balance * rate / 100;
			balance = balance + interest;
		}
		year = year + numberOfYears;
	}

	
	/**
	* Creates a local copy of balance and calculates the balance after the given  
	* number of years based on the given interest rate, then returns the balance  
	* @param numberOfYears the number of years to wait
	*/
	public double balanceAfter(int numberOfYears) {
		double balance1 = balance; 
		for (int i = 1; i <= numberOfYears; i++) {
			double interest = balance1 * rate / 100;
			balance1 = balance1 + interest;
		}
		return balance1;
	}



	/**
	 * Gets the current investment balance.
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * Gets the number of years this investment has accumulated
	 * interest.
	 * @return the number of years since the start of the investment
	 */
	public int getYears() {
		return year;
	}

}
