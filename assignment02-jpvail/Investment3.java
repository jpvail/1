package assignment02;


public class Investment3{
	private double balance;
	private double[] rateHistory = new double[50]; 
	private int year;

	/**
	 * Constructs an Investment object from a starting balance and
	 * interest rate.
	 * @param aBalance the starting balance
	 * @param aRate the interest rate in percent
	 */
	public Investment3(double aBalance, double startRate) {
		balance = aBalance;
		for (int i = 0; i < rateHistory.length; i++){
			rateHistory[i] = startRate; 
		}
		year = 0;
	}



	public void setNewRateFrom(int aYear, double newRate) {
		for (int i = aYear; i < rateHistory.length; i++){
			rateHistory[i] = newRate; 
		}

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
			double interest = balance1 * rateHistory[year1] / 100;
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
			double interest = balance * rateHistory[i] / 100;
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
			double interest = balance1 * rateHistory[i] / 100;
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
