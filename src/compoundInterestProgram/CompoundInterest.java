package compoundInterestProgram;

public class CompoundInterest {
	public static void main(String[] args) {
		//Compound interest is calculated: Amount = Principle[StartVal]*(1+RateInterest)^Years
		double amount, principal = 10000, rate = 0.01;
		
		for(int year = 1; year<=20; year++){
			//Math.Pow is the same as "^"
			amount = principal * Math.pow(1 + rate, year);
			System.out.println(year + "    " + amount);
		}
	}
}
