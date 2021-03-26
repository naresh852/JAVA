import java.util.Iterator;
import java.util.LinkedList;
public class ITERATOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> animals = new LinkedList<String>();
        animals.add("dog");
        animals.add("cat");
        animals.add("bull");
        animals.add("fox");
        ///////////ITERATOR////////////
        Iterator<String> it = animals.iterator();
        while(it.hasNext()) {
        	String animal = it.next();
        	System.out.println(animal);
        	
        	if(animal.equals("cat")) {
        		it.remove();
        	}
        }
        
        
        System.out.println();
        for(String value:animals) {
        	System.out.println(value);
        }
	}

}
