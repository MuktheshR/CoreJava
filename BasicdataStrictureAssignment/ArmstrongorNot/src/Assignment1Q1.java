import java.util.Scanner;

class ArmstrongorNot{
	public boolean armstrongCheck(int num) {
		int n=num;
		int temp=n;
		int r;
		int sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
		}
		if(temp==sum) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
public class Assignment1Q1 {
	public static void main(String args[]) {
		ArmstrongorNot armstrongnum = new ArmstrongorNot();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number");
			int num=sc.nextInt();
			if(armstrongnum.armstrongCheck(num)==true) {
				System.out.println("It is Armstrong");
			}
			else
			{
				System.out.println("Is not an Armstrong");
			}
		}
	}

}
