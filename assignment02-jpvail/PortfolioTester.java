package assignment02;
/**
 * This program computes how much an investment grows in
 * a given number of years.
 */
public class PortfolioTester {
	public static void main(String[] args) {
		Portfolio port = new Portfolio(20000);
		Investment3 invest1 = new Investment3(5000, 5);
		Investment3 invest2 = new Investment3(8000, 10);
		Investment3 invest3 = new Investment3(3000, 9);
		port.addInvestment(1, 0, invest1);
		port.addInvestment(1, 3, invest2);
		port.addInvestment(1, 4, invest3);
		System.out.println(port.indexOfFirstInvestmentToBalance(10000)); 
		port.waitYears(20); 
		System.out.println(port.currentWealth()); 
		Portfolio port2 = new Portfolio(20000);
		Investment3 invest4 = new Investment3(5000, 10);
		Investment3 invest5 = new Investment3(5000, 10);
		Investment3 invest6 = new Investment3(3000, 9);
		Investment3 invest7 = new Investment3(2000, 9);
		Investment3 invest8 = new Investment3(2000, 9);
		port2.addInvestment(1, 0, invest4);
		port2.addInvestment(1, 1, invest5);
		port2.addInvestment(1, 2, invest6);
		port2.addInvestment(1, 3, invest7);
		port2.addInvestment(1, 4, invest8);
		System.out.println(port.indexOfFirstInvestmentToBalance(10000)); 
		Portfolio port3 = new Portfolio(10000);
		Investment3 invest9 = new Investment3(8000, 5);
		Investment3 invest10 = new Investment3(5000, 10);
		port3.addInvestment(1, 0, invest9);
		port3.addInvestment(1, 1, invest10);
	}   
}