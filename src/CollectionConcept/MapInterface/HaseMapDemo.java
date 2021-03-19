package CollectionConcept.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HaseMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> mp=new HashMap<Integer,String>();
		mp.put(1,"100");
		mp.put(2, null);
		mp.put(3,null);
		mp.put(null,"500");
		
		System.out.println(mp);
		
		System.out.println("Total Elements-"+mp.size());
		System.out.println(mp.get(1));
		
		for(Map.Entry<Integer, String> e : mp.entrySet()) {
			String value;
			int key;
			if(e.getKey()!=null) {
				key=e.getKey();
				value=e.getValue();
			}else {
				continue;
			}
			System.out.println("Key-"+key+", value="+value);
		}

	}

}
