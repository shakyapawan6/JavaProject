package CollectionPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hmap =new HashMap<Integer, String>();
		hmap.put(5, "BMW");
		hmap.put(2, "Audi");
		hmap.put(1, "honda");
		hmap.put(4, "BMW");
		System.out.println(hmap);   // {1=honda, 2=Audi, 4=BMW, 5=BMW} 
		System.out.println(hmap.put(7, "XUV")); // will return old entry
		System.out.println(hmap.get(4));
		System.out.println(hmap.keySet());//  return all keys  [1, 2, 4, 5, 7]
		System.out.println(hmap.values());//  return all values [honda, Audi, BMW, BMW, XUV]
		//Iterate map
		Set<Entry<Integer, String>> entery = hmap.entrySet();
		System.out.println(entery);		// return map in the collection form 
	    Map<Integer, String> LHMap =new LinkedHashMap<>();
	    LHMap.put(9, "BMW");
	    LHMap.put(4, "Audi");
	    LHMap.put(1, "Honda");
	    
	    System.out.println("LinkedHashMap Element :"+LHMap);
	    
		}
}


