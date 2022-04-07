import java.util.Scanner;

class SearchArray{
    public boolean searchArray(int[] arr,int toCheckValue){
    	boolean valuefound=false;
    	for(int i=0;i<arr.length;i++)
    	if(arr[i]==toCheckValue) {
    		
    		valuefound=true;
    	}
    	return valuefound;
    	
    }
}
public class Assignment1Q7 {
	 public static void main(String[] args) {
	        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter Element");
				int valueToCheck=sc.nextInt();
				
				SearchArray value = new SearchArray();
				
				if(value.searchArray(arr,valueToCheck)) 
				{
					System.out.println("element is present");
				}
				else 
				{
					System.out.println("element is not present");
				}
			}
	        
	}
}
