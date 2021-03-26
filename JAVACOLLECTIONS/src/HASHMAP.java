import java.util.HashMap;
import java.util.Map;
public class HASHMAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap <Integer,String> car = new HashMap<Integer,String>();
      car.put(1, "one");
      car.put(2, "two");
      car.put(3, "three");
      car.put(4, "four");
      System.out.println(car.get(1));
      /*to print keys only*/
      for(Integer i : car.keySet() ) {
    	  System.out.println(i);
      }
      /*to print values only*/
      for(String j : car.values()) {
    	  System.out.println(j);
      }
      /*to print kay value pairs*/
      for(Integer i : car.keySet()) {
    	  System.out.println("key :"+i + "values "+ car.get(i));
      }
      for(Map.Entry<Integer,String> gih : car.entrySet()) {
    	  System.out.println(gih.getKey()+" : "+gih.getValue());
      }
	}

}
