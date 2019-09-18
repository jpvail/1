package assignment02;


public class Portfolio {
	private double cash;
	private Investment3[] investments = new Investment3[5];

	public Portfolio(double initialCash){
		cash = initialCash; 
	}

	public void waitYears(int numberOfYears) {
		for (var i : investments){
			if ( i != null){
				i.waitYears(numberOfYears); 
			}
		}
	}

	public void addInvestment(int yearOffset, int index, Investment3 invest){
		if(invest == null){
			throw new IllegalArgumentException("Investment must not be null");
		}	

		if (index < 0 || index >= investments.length){
			throw new IllegalArgumentException("index out of bounds");
		}

		if (investments[index] != null){
			throw new IllegalArgumentException("previous investment is stored at that index");

		}

		if (invest.getBalance() > cash){
			throw new IllegalArgumentException("insufficient funds");
		}


		invest.waitYears(yearOffset);
		investments[index] = invest; 
		cash = cash - invest.getBalance(); 
	}

	

	public void cashInInvestment(int index){
		if (index < 0 || index >= investments.length){
			throw new IllegalArgumentException("index out of bounds");
		}

		cash = cash + investments[index].getBalance(); 
		investments[index] = null; 
	}

	public int indexOfFirstInvestmentToBalance(double targetBalance){
		
		int[] yearValues = new int[5]; 
		for(int i = 0; i < investments.length; i++){
			if(investments[i] != null){
				yearValues[i] = investments[i].yearsToBalance(targetBalance); 
			}
		}
		int indexOfMinValue = 0; 
		int minValue = yearValues[0];
		for (int i = 1; i < yearValues.length; i++){
			if(yearValues[i] < minValue && yearValues[i] != 0){
				minValue = yearValues[i]; 
				indexOfMinValue = i; 
			}
		}

		return indexOfMinValue; 
	}

	public double currentWealth(){
		double wealth = 0;
		for( var i : investments){
			if( i != null){
				wealth = wealth + i.getBalance(); 
			}
		}
		
		wealth = wealth + cash; 
		return wealth; 
	}

}
