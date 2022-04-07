import java.util.TreeMap;
public class contact {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 444444444, "Rawal");
		contact.put((long) 333333333, "Shivamani");
		contact.put((long) 222222222, "Nusair");
		contact.put((long) 111111111, "Moshin");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}