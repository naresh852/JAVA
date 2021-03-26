import java.util.List;
import java.util.SortedSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

class person3 implements Comparable<person3>{
	private String name;
	public person3(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person3 other = (person3) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
//	@Override
//	public int compareTo(person3 pe) {
//		// TODO Auto-generated method stub
//		return -name.compareTo(pe.name);
//	}
	@Override
	public int compareTo(person3 pe) {
		// TODO Auto-generated method stub
		int len1 = name.length();
		int len2 = pe.name.length();
		if(len1>len2) {
			return 1;
		}else if(len1<len2) {
			return -1;
		}else {
			return name.compareTo(pe.name);
		}
	}
}
public class NATURALOREDRCOMPARABLEINTERFACE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<person3> list = new ArrayList<person3>();
        SortedSet<person3> set = new TreeSet<person3>();
        addelements(list);
        addelements(set);
        
        Collections.sort(list);
        
        showelements(list);
        System.out.println();
        showelements(set);
        
	}
	private static void addelements(Collection<person3> col) {
		col.add(new person3("mike"));
		col.add(new person3("lord"));
		col.add(new person3("peak"));
		col.add(new person3("pug"));
		col.add(new person3("ant"));
	}
	private static void showelements(Collection<person3> col) {
		for(person3 element : col) {
			System.out.println(element);
		}
	}

}
