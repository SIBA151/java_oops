package CollectionConcept;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(100);
		ll.add(400);
		ll.add(100);
		ll.add(500);
		
		ll.addFirst(900);
		ll.addLast(1000);
		
		System.out.println(ll);
        System.out.println("===============");
        ll.removeLast();
        System.out.println(ll);
        
        ListIterator litr = ll.listIterator();
        while(litr.hasNext()) {
        	System.out.println(litr.next());
        }
        System.out.println("===============");
        while(litr.hasPrevious()) {
        	System.out.println(litr.previous());
        }
	}

}
