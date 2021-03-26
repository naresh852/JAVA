import java.util.ArrayList;
import java.util.List;

public class ARRAYLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer>numbers = new ArrayList<Integer>();
      //adding numbers
      numbers.add(10);
      numbers.add(25);
      numbers.add(56);
      numbers.add(75);
      //retrieving
      System.out.println(numbers.get(0));
      System.out.println();
      //iteration one
      for(int i = 0;i<numbers.size();i++) {
    	  System.out.println(numbers.get(i));  
      }
      System.out.println();
      //remove items carefulluy
      // fast removing from last
      numbers.remove(numbers.size() - 1);
      //remove items from beginning
      numbers.remove(0);
      //iteration two
      for(Integer value : numbers) {
    	System.out.println(value);  
      }
      //list interfacwe
      List<String> value = new ArrayList<String>();
	}
}
