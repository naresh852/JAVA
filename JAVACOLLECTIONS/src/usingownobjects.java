import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class usingownobjects {
//using own OBJECTS IN SETS AND MAP
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person p1 = new person(0,"zero");
		person p2 = new person(1,"one");
		person p3 = new person(2,"two");
		person p4 = new person(1,"one");
     Map<person,Integer> set1 = new LinkedHashMap<person,Integer>();
     set1.put(p1, 1);
     set1.put(p2, 2);
     set1.put(p3, 3);
     set1.put(p4, 1);
     
//     System.out.println(set1);
     for(person kay : set1.keySet()) {
    	 System.out.println("key is {"+kay+"} value is "+set1.get(kay));
     }
     //SET
     Set<person> set2 = new LinkedHashSet<person>();
     set2.add(p1);
     set2.add(p2);
     set2.add(p3);
     set2.add(p4);
     System.out.println(set2);
     
	}

}
