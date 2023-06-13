package day40Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("key1", "admin");//upcasting
		m1.put("key2", "admin");//upcasting
		m1.put(null, "admin123");//upcasting
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());
		m1.put("key2", "manager");
		m1.put(458, "manager");
		m1.put(null, 1234);//boxing dn upcasting
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());
		
		System.out.println("Get the key value: "+m1.get("key2"));
		System.out.println("key set of map: "+m1.keySet());
		System.out.println("values of map: "+m1.values());		
	}
}

/**
 * In Map, each entry will be having key-value pair
 * key and value both will be in the form Object
 * key should unique
 * Value can be duplicated
 * based key you can get the values
 * to add element in Map we use put()
 * 
 * 
 */ 
