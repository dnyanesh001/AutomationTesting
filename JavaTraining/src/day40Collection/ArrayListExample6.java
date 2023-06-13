package day40Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayListExample6 {

	public static void main(String[] args) {
		
		//Generic: with the help of generic we can force collection to store similar type of data
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(10);
		l2.add(2);
		l2.add(15);
		l2.add(18);
		System.out.println("Size: "+l2.size());
		System.out.println("Elements of collection: "+l2);//12,10,2,15,18--> 18,15,2,10,12
		Collections.sort(l2);
		System.out.println("After sorting Elements of collection: "+l2);//
		Collections.reverse(l2);
		System.out.println("Reversing sorted Elements of collection: "+l2);
	}
}
