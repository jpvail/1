package assignment02;
/**
 * This program computes how much an investment grows in
 * a given number of years.
 */
public class InvestmentRunner2 {
	public static void main(String[] args) {
		final double INITIAL_BALANCE = 10000;
		final double RATE = 5;
		final int YEARS = 20;
		Investment2 invest = new Investment2(INITIAL_BALANCE, RATE);
		System.out.println(invest.balanceAfter(YEARS)); 
		System.out.println("Current Balance: " + invest.getBalance());
		System.out.println("Years: " + invest.getYears()); 
		invest.waitYears(YEARS);
		System.out.println("New Balance: " + invest.getBalance());
		System.out.println("New Years: " + invest.getYears());
	}   
}