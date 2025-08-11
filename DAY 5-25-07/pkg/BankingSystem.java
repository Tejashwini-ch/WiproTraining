package pkg;

public class BankingSystem {
	public static void main(String[]args) {
		//Anonymous Class for Interest Calculation
		Interest interestCalculator = new Interest() {
		//Interest=(p*t*r)/100
		public double InterestCalculator(double principal, double rate, double time){
			double result = (principal * rate * time) / 100;
			System.out.println("The Interest for the given time period is: "+result);	
			return result;
		}
		};
		//now we have to call the Interest calculator method
		interestCalculator.InterestCalculator(10000,2.3 , 4.5);

		
		//Anonymous Class for EMI calculation
		LoanEMI emiCalculator=new LoanEMI() {
			//EMI = [P x R x (1+R)^N] / [(1+R)^N - 1].
			public double EMICalculator(double principal, double rate, double timeInMonths) {
				double monthlyrate = rate / (12 * 100);
				double result=(principal*monthlyrate*Math.pow(1+monthlyrate, timeInMonths))/(Math.pow(1+monthlyrate, timeInMonths)-1);
				System.out.println("Monthly EMI: "+result);
				return result;//if you omit return it will give you and it is not a void type
			}
		};
		emiCalculator.EMICalculator(200000, 7.5, 60);
		
		//Anonymous class currency converter
		CurrencyConversion currencyToUsd=new CurrencyConversion() {
			//INR to USD=0.012 ,,,USD to INR is 86.53
			public double  CurrencyConverter(double inrAmount) {
				double conversionRate=86.53;
				double result=inrAmount/conversionRate;
				System.out.println("The Currency conversion from INR "+inrAmount+" to USD is: "+result);
				return result;
			}
		};
		currencyToUsd.CurrencyConverter(10000);
	}
}


