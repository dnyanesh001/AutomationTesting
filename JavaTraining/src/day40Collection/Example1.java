package day40Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
	
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
				//or
		List ls1=new ArrayList();//run time poly--> inheritance, upcasting & overriding
		System.out.println("Is List collection empty ? "+ls1.isEmpty());		
		//to add any object in collection use add() method
		ls1.add("Pune");//auto upcasting, String object converted into Object class object
		// Integer intObj=25; ---> Object obj=intObj;
		ls1.add(25);// Auto boxing, int converted into Integer class object, dn Integer class object will be converted into Object class object
		ls1.add("Pune");
		ls1.add(null);
		System.out.println("List elements are: "+ls1);
		System.out.println("Is List collection empty ? "+ls1.isEmpty());
		//if you want to add element into sepcific index dn use add(index, obj);
		ls1.add(1, "Mumbai");
		System.out.println("List elements are: "+ls1);
		//if you want to update existing object value use-
		ls1.set(3, "Delhi");
		System.out.println("Updated List elements are: "+ls1);//Pune, Mumbai, 25, Delhi, null
		
		List ls2=new ArrayList();
		ls2.add("Deccan");
		ls2.add("VimanNagar");
		ls2.add("Hinzewadi");
		System.out.println("List2 elements are: "+ls2);//Deccan,VimanNagar,Hinzewadi
		
		//if you want to add one collection elements into another collection dn use-
		ls2.addAll(ls1);
		System.out.println("List2 elements, after adding List1: "+ls2);//Deccan,VimanNagar,Hinzewadi,Pune, Mumbai, 25, Delhi, null
	
		List ls3=new ArrayList();
		ls3.add("Red");
		ls3.add("Pink");
		ls3.add("Black");
		System.out.println("List3 elements are: "+ls3);//Red,Pink,Black
		//if you want to add one collection into another from specific index dn use
		ls3.addAll(1,ls1);
		System.out.println("List3 elements, after adding List1: "+ls3);//Red,Pune, Mumbai, 25, Delhi, null,Pink,Black
	
		//to get a particular element from the collection use -
		System.out.println("Element present in 2nd index: "+ls3.get(2));
		//to count number of element present in collection use
		System.out.println("List3 element count is: "+ls3.size());
		//to get one by one element of collection use normal for loop
		for(int i=0;i<ls3.size();i++) {
			System.out.println("Element at index "+i+": "+ls3.get(i));
		}
		System.out.println("**********************************");
		//to get one by one element of collection use for each loop
		for(Object obj:ls3) {
			System.out.println(obj);
		}
		System.out.println("*********************************");
		List ls4=new ArrayList();
		ls4.add("Apple");
		ls4.add("Orange");
		ls4.add("Grapes");
		System.out.println("List4 elements are: "+ls4);
		//to get one by one element of collection, we can also use iterator()--> return Iterator interface
		Iterator itr=ls4.iterator();
		/**
		 * Iterator interface contains several method but widely used methods are-
		 * hasNext() ---> return true/false
		 * next()	 ---> returns the next element of collection, if collection don;t have next element dn it will throw an exception as NoSuchElementException
		 * remove()	 ---> deletes the elements from the collection
		 * 
		 * Note: Iterator object can be used only once for iterating the collection element, for next iteration you need create new instance of Iterator
		 */
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());//NoSuchElementException
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("###############################");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Iterator itr1=ls4.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
