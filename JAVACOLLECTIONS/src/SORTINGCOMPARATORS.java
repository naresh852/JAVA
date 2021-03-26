import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 > len2) {
			return 1;
		}else if(len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}
class AlphabeticalOrder implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2);
	}
	
}
class ReverseAlphabeticalOrder implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return -s1.compareTo(s2);
	}
	
} 
class reversenumbers implements Comparator<Integer>{

	@Override
	public int compare(Integer num1, Integer num2) {
		// TODO Auto-generated method stub
		return -num1.compareTo(num2);
	}
	
}

public class SORTINGCOMPARATORS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LIST ANIMALS
		//SORTING STRINGS
      List<String> animals = new ArrayList<String>();
      animals.add("cat");
      animals.add("dog");
      animals.add("lion");
      animals.add("monkey");
      animals.add("bat");
      Collections.sort(animals,new ReverseAlphabeticalOrder());
      for(String animal : animals) {
    	  System.out.println(animal);
      }
      //new list NUMBERS
      //SORTING NUMBERS
      List<Integer> numbers = new LinkedList<Integer>();
      numbers.add(2);
      numbers.add(56);
      numbers.add(52);
      numbers.add(42);
      numbers.add(96);
      numbers.add(75);
   //SORT ALPHABETICAL ORDER OR NATURAL ORDER
      Collections.sort(numbers,new reversenumbers());
      for(Integer number : numbers) {
    	  System.out.println(number);
      }
      //////////SORTING ARBITRARY ORDER////////////////
      List<person1> people = new ArrayList<person1>();
      people.add(new person1(1,"joe"));
      people.add(new person1(3,"bose"));
      people.add(new person1(2,"kim"));
      people.add(new person1(4,"loser"));
      //SORTING BASED ON IDS
      Collections.sort(people , new Comparator<person1>() {

		@Override
		public int compare(person1 p1, person1 p2) {
			// TODO Auto-generated method stub
			if(p1.getId() > p2.getId()) {
				return 1;
			}else if(p1.getId() < p2.getId()) {
				return -1;
			} 
			return 0;
		}
      });
      
      for(person1 person : people) {
    	  System.out.println(person);
      }
      System.out.println();  
      //SORTING BASED ON NAMES
      Collections.sort(people , new Comparator<person1>() {

  		@Override
  		public int compare(person1 p1, person1 p2) {
  			// TODO Auto-generated method stub
  			
  			return p1.getName().compareTo(p2.getName());
  		}
      	  
        });
      for(person1 person : people) {
    	  System.out.println(person);
      }
	}

}
