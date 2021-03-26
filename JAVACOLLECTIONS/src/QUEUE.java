import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QUEUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
      //throws no such element execption
//      System.out.println("head of queue :"+q1.element());
      q1.add(2);
      q1.add(5);
      q1.add(6);
      System.out.println("head of queue :"+q1.element());
      try {q1.add(23);}
     catch(IllegalStateException e) {
    	 System.out.println("tred to add more than 3 items");
     }
     for(Integer value : q1){
    	 System.out.println(value);
     }
//     int value = q1.remove();
     System.out.println("removed from queue :"+q1.remove());
     System.out.println("removed from queue :"+q1.remove());
     System.out.println("removed from queue :"+q1.remove());
     try { System.out.println("removed from queue :"+q1.remove());}
    catch(NoSuchElementException e) {
    	System.out.println("too many itema to remove");
    }
     System.out.println();
     ///////////////////////new queue///////////////
     Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3);
    System.out.println("q2 head is "+q2.peek());
    q2.offer(5);
    q2.offer(8);
    q2.offer(56);
    q2.offer(25);
    System.out.println("q2 head is "+q2.peek());
    if(q2.offer(25) == false) {
    	System.out.println("failed to add fourth item");
    }
    
    for(Integer value : q2){
   	 System.out.println(value);
    }
    
    System.out.println("q2 value removed "+q2.poll());
    System.out.println("q2 value removed "+q2.poll());
    System.out.println("q2 value removed "+q2.poll());
    System.out.println("q2 value removed "+q2.poll());
	}

}
