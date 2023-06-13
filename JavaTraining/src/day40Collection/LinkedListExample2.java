package day40Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample2 {
	public static void main(String args[]) {
		LinkedList<String> ll = new LinkedList<String>();
		System.out.println("Initial list of elements: " + ll);
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("After invoking add(E e) method: " + ll);
		// Adding an element at the specific position
		ll.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + ll);
		Iterator<String> itr=ll.iterator();//hasNext(), next(),remove()
		
		ListIterator<String> litr=ll.listIterator();//hasNext() & hasPrevious(), next() & previous(),remove()
		System.out.println("Check whether we have any element before 1st element: "+litr.hasPrevious());
		//System.out.println("Before 1st element: "+litr.previous());// you will get no such element exception
		System.out.println("Check whether collection has element or not: "+litr.hasNext());
		System.out.println("First element: "+litr.next());
		System.out.println("First element: "+litr.next());
		System.out.println("Before 1st element: "+litr.previous());
		System.out.println("Before 1st element: "+litr.previous());
	}
}
