import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambdaq3 {

	public static void main(String[] args) {
		// in these we are using funtional interface with api .accept 
		Consumer <Integer> consumer = P -> System.out.println("hello"+P);
		consumer.accept(10);
		
		Predicate <Integer> predicate = P -> P%2==0;// predicate fuctional interface we use .test()
		System.out.println(predicate.test(10));
		
		Supplier <String> supplier = () -> "Hi Mukthesh";//  supplier functional interface .get()
		System.out.println(supplier.get());
	}
}