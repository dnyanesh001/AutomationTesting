package day40Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapExample {
	public static void main(String[] args) {
		Map m1=new TreeMap();
		m1.put("key1", "admin");//upcasting
		m1.put("key5", "admin");//upcasting
		m1.put("key3", "admin123");//upcasting
		m1.put("key0", "admin");//upcasting
		System.out.println("Map elements are: "+m1);
		System.out.println("Map element count: "+m1.size());	
	}

}
