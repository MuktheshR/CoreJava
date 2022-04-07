import java.util.Scanner;

class TaxAmount{
    public double calculateTaxAmount(int ctc){
    	double tax=0;
    	if(ctc <= 180000)
    	{
    		double slabA = tax;
    		System.out.println("Tax amount payable"+" "+slabA);
    	}
    	else if(ctc>= 181001 && ctc <= 300000)
    	{
    		tax=(ctc*10)/100;
    		double slabB=tax;
    		System.out.println("Tax amount payable"+" "+slabB);
    	}
    	else if(ctc>= 300001 && ctc <= 500000)
    	{
    		tax=(ctc*20)/100;
    		double slabC=tax;
    		System.out.println("Tax amount payable"+" "+slabC);
    	}
    	else if (ctc>=500001 && ctc<=1000000)
    	{
    		tax=(ctc*30)/100;
    		double slabD=tax;
    		System.out.println("Tax amount payable"+" "+slabD);
    	}
		return tax;
    
    	
    }
}

public class Assignment1Q5 {
    public static void main(String args[]) {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter ctc");
			int ctc =  sc.nextInt();
			TaxAmount salary = new TaxAmount();
			salary.calculateTaxAmount(ctc);
		}
    }
	
}
