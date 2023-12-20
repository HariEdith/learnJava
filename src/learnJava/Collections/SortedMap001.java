package learnJava.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMap001 {
	public static void main(String args[]) {
		
		Map<Integer, String> hashmap= new HashMap<Integer, String>();
		Map<Integer, String> linkedhmap= new LinkedHashMap<Integer, String>();
		Map<Integer, String> treehmap= new TreeMap<Integer, String>();
		
		testmap(hashmap);
	}
	public static void testmap(Map<Integer,String> map) {
		
		map.put(9, "ameen");
		map.put(0, "karthik");
		map.put(1, "Gunalam");
		map.put(5, "vijay");
		map.put(8, "Ganesh");
		
		
		for(Integer key: map.keySet()) {
			
			String value = map.get(key);
			System.out.println(value);
		}
		
		
	}
}
