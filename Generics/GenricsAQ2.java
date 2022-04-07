package first.java;
import java.util.*;
			import java.util.HashMap;
import java.util.Random;
public class GenricsAQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//hash map is used to give every key a specificvalue    HashMap<String, Integer> map = new HashMap<>();
		//Now it is Not required to declare on right
		//HashMap<K, V> ,HashMap<Key,Value>
		//It stores the data in (Key, Value) pairs, and you can access them by an index of another type (e.g. an Integer).
		//One object is used as a key (index) to another object (value).
		// RANDOM IS USED TO GETT RANDOM NUMBERS 
	
        Random rand=new Random();


        HashMap<Integer, Double>map=new HashMap<Integer, Double>();
        for(int i=0;i<=10;i++) {
            int rando = rand.nextInt(10);
            Double ran = rand.nextDouble();
            map.put(rando, ran);

        }
        System.out.println(map);


    }
}
	

