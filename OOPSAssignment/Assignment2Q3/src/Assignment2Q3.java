import java.util.ArrayList;

public class Assignment2Q3 {
	int totalcash=0;
	public int getCash(int totalcash){
    	this.totalcash=totalcash;
    	return totalcash;
    }
	  public int totalCashInBank(ArrayList<Integer> cash){
		  int totalcas=0;
	    	for(Integer cash1:cash) {
	    		totalcas+=cash1;
	    		
	    	}
			return totalcas;
	  }
	    
	    public static void main(String[] args) {
	    	Assignment2Q3 bankbalance = new Assignment2Q3();
	    	CurrentAccount currentbal = new CurrentAccount();
	    	int currbal = currentbal.getCash(bankbalance.totalcash);
	    	SavingsAccount savingsbal = new SavingsAccount();
	    	int savingbal = savingsbal.getCash(bankbalance.totalcash);
	    	ArrayList<Integer> cashinarray = new ArrayList<>();
	    	cashinarray.add(currbal);
	    	cashinarray.add(savingbal);	
	    	System.out.println(cashinarray);
	    }

}
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash(int totalcash) {
    	this.totalcash=totalcash;
    	totalcash=totalDeposits+creditLimit;
    	return totalcash;
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash(int totalcash) {
    	this.totalcash=totalcash;
    	totalcash=totalDeposits+fixedDepositAmount;
    	return totalcash;
    }
}