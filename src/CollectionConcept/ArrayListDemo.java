package CollectionConcept;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//non generic collection
		List al=new ArrayList ();
		
		al.add(100);
		al.add(100.67);
		al.add("100");
		al.add(true);
		
		System.out.println(al);
		
//		//generic
//		List<Integer> al=new ArrayList<Integer>();
//		al.add(100);
//		al.add(200);
//		al.add(300);
//		al.add(400);
//		al.add(100);
//		al.add(700);
//		al.add(800);
//		
//		al.add(4, 1100);
//		System.out.println(al);
//		
//		System.out.println("Size of Collection-"+al.size());
//		
//		//to get the value from list
//		int x=al.get(2);
//		System.out.println(x);
//		
//		List<Integer> list=new ArrayList<Integer>();
//		list.add(900);
//		list.add(2300);
//		list.add(1300);
//		
//		
//		list.addAll(al);
//		//list.addAll(1,al);
//		System.out.println(list);

	}

}
