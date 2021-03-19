package CollectionConcept;

import java.util.HashSet;
import java.util.Set;

public class HaseSetDemo {

	public static void main(String[] args) {
		Set st=new HashSet();
		st.add("test");
		st.add("test");
		st.add("200");
		st.add("60");
		st.add("400");
		
		Set st1=new HashSet();
		st1.add("abc");
		st1.add("abc");
		st1.add("50");
		st1.add("60");
		st1.add("70");
		
		st.addAll(st1);
		//st.retainAll(st1);
		
		//st.remove("60");
		
		System.out.println(st);

	}

}
