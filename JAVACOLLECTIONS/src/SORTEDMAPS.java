import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
class Temp{
	
}
public class SORTEDMAPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
         Map<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
         Map<Integer,String> treemap = new TreeMap<Integer,String>();
         System.out.println(new Temp());
         mapping(hashmap);
         mapping(linkedhashmap);
         mapping(treemap);
	}
	public static void mapping(Map<Integer,String> map) {
		map.put(0, "zero");
		map.put(5, "one");
		map.put(2, "two");
		map.put(4, "three");
		map.put(1, "four");
		map.put(3, "five");
		
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key +":"+value);
		}
		System.out.println();
	}

}
