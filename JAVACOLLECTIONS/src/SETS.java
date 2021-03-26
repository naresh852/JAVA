import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SETS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashset doesnot retain order
//      Set<String> set1 = new HashSet<String>();
      
      
      //stores item in order of insertion order
//      Set<String> set1 = new LinkedHashSet<String>();
      
      //stores in natural order alphabetical order
      Set<String> set1 = new TreeSet<String>();
      
      //check if set empty
      if(set1.isEmpty()) {
    	  System.out.println(":is empty at start");
      }
      set1.add("cat");
      set1.add("dog");
      set1.add("monkey");
      set1.add("camel");
      set1.add("zebra");
      
      if(set1.isEmpty()) {
    	  System.out.println(":is empty at end");
      }
      //adding duplicate items does nothing
      set1.add("camel");
      System.out.println(set1);
      //iteration loop
      for(String item : set1) {
    	  System.out.println(item);
      }
      //set contains to get certain item
      if(set1.contains("joker")) {
    	  System.out.println("set1 containes joker!");
      }
      if(set1.contains("camel")) {
    	  System.out.println("contains camel");
      }
      
      // new set 
      Set<String> set2 = new TreeSet<String>();
      set2.add("cat");
      set2.add("buffalo");
      set2.add("jelly");
      set2.add("dog");
      set2.add("lily");
      //copy elements of set1
      Set<String> intersection = new HashSet<String>(set1);
      System.out.println(intersection);
      //perform intersection
      intersection.retainAll(set2);
      System.out.println(intersection);
      
      // difference
      //copy all elements
      Set<String> difference = new HashSet<String>(set2);
      //perform difference
      difference.removeAll(set1);
      System.out.println(difference);
      
      //union
      Set<String> union = new HashSet<String>(set1);
      union.addAll(set2);
      System.out.println(union);
      
      
	}

}
