import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LINKEDLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*arraylist manage items internallly
		 [0][1][]2[3]*/
       List<Integer> arraylist = new ArrayList<Integer>();
       
       /*linkedlist consists of elements where each element has a refernece to
        * the previous and the next element
        [0]-->[1]-->[2]<--[3]*/
       List<Integer> linkedlist = new LinkedList<Integer>();
       timings("Arraylist",arraylist);
       timings("LinkedList",linkedlist);
	}
   private static void timings(String type,List<Integer> list) {
//	   for(int i = 0;i<1E5;i++) {
//		   list.add(i);
//	   }
	   long start = System.currentTimeMillis();
	   /*add items at end*/
//	   for(int i=0;i<1E5;i++) {
//		   list.add(i);
//	   }
//	   
	   for(int i=0;i<1E5;i++) {
		   list.add(0, i);
	   }
	   long end = System.currentTimeMillis();
	   System.out.println("time taken "+(end - start)+" ms for "+type);
   }
}
