package assignment02;
/**
 * This program computes how much an investment grows in
 * a given number of years.
 */
public class InvestmentRunner3 {
	public static void main(String[] args) {
		final double INITIAL_BALANCE = 10000;
		final double RATE = 5;
		final int YEARS = 20;
		Investment3 invest = new Investment3(INITIAL_BALANCE, RATE);
		invest.setNewRateFrom(10, 10); 
		invest.setNewRateFrom(15, 15);
		invest.setNewRateFrom(20, 20);
		System.out.println(invest.balanceAfter(YEARS)); 
		double balance = invest.getBalance();
		System.out.println("Current Balance: " + invest.getBalance());
		System.out.println("Years: " + invest.getYears()); 
		invest.waitYears(YEARS);
		System.out.println("New Balance: " + invest.getBalance());
		System.out.println("New Years: " + invest.getYears());
	}   
}