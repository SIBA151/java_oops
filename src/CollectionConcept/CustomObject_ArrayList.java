package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomObject_ArrayList {

	public static void main(String[] args) {
		CustomClass obj1=new CustomClass(100);
		CustomClass obj2=new CustomClass(200);
		CustomClass obj3=new CustomClass(300);
		CustomClass obj4=new CustomClass(400);
		
		//Object Integer,String,Arrays
		List<CustomClass> list=new ArrayList<CustomClass>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		System.out.println(list);
		
		Iterator<CustomClass> itr=list.iterator();
		
		while(itr.hasNext()) {
			CustomClass ref=itr.next();
			ref.getFields();
		}

	}

}
