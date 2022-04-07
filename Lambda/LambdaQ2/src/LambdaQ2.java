
import java.util.ArrayList;
import java.util.Arrays;

class orders{

	    private int totalPrice;
	    private String status;
	   public orders(int totalPrice,String status) {
		   this.totalPrice = totalPrice;
		   this.status = status;
	   }
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
			return "orders{"+"totalPrice=" +totalPrice+"status="+status+"}";
	}	    
  }
     public class LambdaQ2 {
    	 
      public static void main(String[] args) {
    	  // Here we have passed array list
    	  ArrayList<orders> Orders1 = new ArrayList<>(Arrays.asList(
                  new orders(112000, "COMPLETED"),
                  new orders(30000, "COMPLETED"),
                  new orders(5000, "ACCEPTED"),
                  new orders(5000, "ACCEPTED"),
                  new orders(110000, "NOT ACCEPTED")));
    	  //now we are using .stream to stream and used filter to get only with price >10k and runned a 
    	  // for each loop will iterate through above array list and print only which have>10k other would be filtered
    	    Orders1.stream().filter(t->t.getTotalPrice()>10000)
    	           .forEach(t-> System.out.println("status " +t));
	}
}