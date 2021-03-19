package CollectionConcept.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapping {

	public static void main(String[] args) {
		Trainer t1=new Trainer();
		Trainer t2=new Trainer();
		
		Student s1=new Student();
		Student s2=new Student();
		
		Map<Trainer,Student> mp=new HashMap<>();
		mp.put(t1, s1);
		mp.put(t2, s2);
		
		int i=1;
		for(Map.Entry<Trainer, Student>e:mp.entrySet()) {
			Trainer tr=e.getKey();
			Student st=e.getValue();
			
			tr.set_trName("trainer"+i);
			st.set_stName("Student"+i);
			
			System.out.println(tr.get_trName());
			System.out.println(st.get_stName());
			i++;
		}

	}

}
