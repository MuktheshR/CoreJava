 class SingletonInheritanceCheck {
	 public static void main(String[] args) {
		 Assignment2Q1 name1 = Assignment2Q1.getuniqueInstance();
		 Assignment2Q1 name2 = Assignment2Q1.getuniqueInstance();
         System.out.println(name1);
         System.out.println(name2);
	 }
	}
public class Assignment2Q1{
	private String name;
	
	private static Assignment2Q1 uniqueInstance;
	
	private Assignment2Q1() {
		name="vicky";
	}
	
	public static Assignment2Q1 getuniqueInstance(){
		
		if(uniqueInstance==null) {
			uniqueInstance = new Assignment2Q1();
		}
		
		return uniqueInstance;
		
	}
	
	}

