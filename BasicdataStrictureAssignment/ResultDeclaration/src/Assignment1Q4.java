import java.util.Scanner;

class ResultDeclaration{
    public String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
    	double sum= subject1Marks+subject2Marks+subject3Marks;
    	if( (sum<60 || (subject1Marks>60 && subject2Marks<60 && subject3Marks<60)) || (sum<60 || (subject2Marks>60 && subject1Marks<60 && subject3Marks<60)) || (sum<60 || (subject3Marks>60 && subject2Marks<60 && subject1Marks<60)) ) {
           System.out.println(sum+"\n failed"); 
        }
    	else if(sum>60 && ((subject1Marks+subject2Marks >=60) && (subject2Marks+subject3Marks>=60) && subject1Marks+subject3Marks>=60))
            System.out.println(sum+"\npassed");
    	else
    		System.out.println(sum+"\npassed\npromoted");
    	
		return null;
	}
}

public class Assignment1Q4 {
	public static void main(String[] args) {
		double subject1Marks;
		double subject2Marks;
		double subject3Marks;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Subject1Marks");
			subject1Marks=sc.nextDouble();
			System.out.println("Enter Subject2Marks");
			subject2Marks=sc.nextDouble();
			System.out.println("Enter Subject3Marks");
			subject3Marks=sc.nextDouble();
		}
		ResultDeclaration Sum = new ResultDeclaration();
		Sum.declareResults(subject1Marks, subject2Marks, subject3Marks);
	}
}
