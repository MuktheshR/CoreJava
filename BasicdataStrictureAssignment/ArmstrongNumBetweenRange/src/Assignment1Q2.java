//Mukthesh
class ArmstrongNumBetweenRange{
    public int[] armstrongNumbersInRange(int min , int max){
    	for(int i=min;i<max;i++) {
    		int num=i;
    		int sum=0;
    		int r;
    		while(num>0) {
    			r=num%10;
    			num=num/10;
    			sum=sum+(r*r*r);
    		}
    		if(i==sum) {
    			System.out.println(sum);
    		}
    	}
		return null;
    }
}
public class Assignment1Q2 {
	public static void main (String [] args) {
           ArmstrongNumBetweenRange obj = new ArmstrongNumBetweenRange();
	       obj.armstrongNumbersInRange(100,999);

	    }

}
