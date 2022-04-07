import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	double SI= (principalAmount*time*interestRate/100);
    	System.out.println(SI);
		return SI;
		
		 }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double CI =(principalAmount * (Math.pow((1+interestRate),time)) ) - principalAmount;
    	System.out.println(CI);
    	return CI;
		}
    
}
public class Assignment1Q3 {
	public static void main (String args[]) {
		double principalAmount;
		int time;
		double interestRate;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter principal amount");
			principalAmount=sc.nextDouble();
			System.out.println("Enter Term of loan in year");
			time=sc.nextInt();
			System.out.println("Annual interest rate");
			        interestRate=sc.nextDouble();
		}
		SiCi sici = new SiCi();
		sici.simpleInterest(principalAmount, time, interestRate);
		
		SiCi sici1 = new SiCi();
		sici1.compoundInterest(principalAmount, time, interestRate);
		

		
	}

}
