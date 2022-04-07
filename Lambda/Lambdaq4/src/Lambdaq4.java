import java.util.ArrayList;

public class Lambdaq4 {

	public static void main(String[] args) {
		
	   ArrayList<String> list1 = new ArrayList();
	   list1.add("bhargav");
	   list1.add("Vishnu");
	   list1.add("Rohan");
	   list1.add("Mukthesh");
	   list1.add("RamShaym");
	   list1.removeIf(n -> n.length()%3==0);
        System.out.println(list1);
	}

}