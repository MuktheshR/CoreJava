import java.util.Scanner;

class Login{
    String userId = "Vicky";
    String password = "Password";
    int loginattemp=3;
    public String loginUser(String user, String pass) {
    	
    	if (user.equals(userId) && pass.equals(password)) {
    		System.out.println("Welcome"+" "+ userId);
    		
    	}
    	else {
    
    		System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    		
    	}
    	return pass;
	
    }

}
public class Assignment1Q6 {
    public static void main(String[] args) {
    	try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter userid");
			String user = sc.nextLine();
			System.out.println("Enter pass word");
			String pass = sc.nextLine();
			Login credential = new Login();
			credential.loginUser(user, pass);
		}
    }

}
