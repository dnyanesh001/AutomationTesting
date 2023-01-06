package QueueExamples;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample1 {
	public static void main(String args[])
	{
		System.out.println("Program started");
		new SetQueue();
		System.out.println("Program ends");
	}
}
class SetQueue 
{
	
	
	public SetQueue()
	{
		Queue queue=new PriorityQueue();
		//while adding elements in queue , it wil always keep smallest element on the top
		System.out.println("Size: "+queue.size());
		System.out.println("Elements of queue: "+queue);
		queue.add(12);
		queue.add(231);
		queue.add(123);
		queue.add(10);
		System.out.println("Size: "+queue.size());
		System.out.println("Elements of the String"+queue);
//		element() returns top most element of the queue, if the queue if empty dn it
//		will throw an an exception by name'NOSuchElementException'
		System.out.println(queue.element());
//		peek () returns tpp most elemnts of the queueif empty dn it
//		will returns 'null' instead of throwing exception
		System.out.println("head element of the queue using peek"+queue.peek());
		System.out.println("Iterating  the queue elements using for-each loop: ");
		for(Object obj:queue)
		{
			System.out.println(obj);
		}
	
	}
		
}


