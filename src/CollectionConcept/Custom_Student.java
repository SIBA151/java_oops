package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Custom_Student {

	public static void main(String[] args) {
		Student obj1=new Student("Ram",96);
		Student obj2=new Student("Sham",100);
		Student obj3=new Student("Rohit",95);
		Student obj4=new Student("Raju",19);
		
		List<Student> list = new ArrayList<Student>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		System.out.println(list);
		Iterator<Student> itr=list.iterator();
		
		while(itr.hasNext()) {
			Student ref=itr.next();
			ref.studentDetails();
		}

	}

}
