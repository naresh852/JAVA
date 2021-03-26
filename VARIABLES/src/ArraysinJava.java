import java.util.Scanner;

public class ArraysinJava {
      public static void main(String[]args) {
    	  String [] friends=new String[5];
    	  //String [] friends ={"mike","tyson","lost"};
    	  Scanner i = new Scanner(System.in);
    	  friends [0]=i.nextLine();
    	  System.out.println(friends[0]);
    	  i.close();
    	  String[][] words = new String[2][];
          
          // Each sub-array is null.
          System.out.println(words[0]);
           
          // We can create the subarrays 'manually'.
          words[0] = new String[3];
          words[1] = new String[4];
           
          // Can set a values in the sub-array we
          // just created.
          words[0][0]="0 0";
      
          System.out.println(words[0][0]);
          words[0][1] = "hi there";
          words[1][0]="kfodl";
          System.out.println(words[1][0]);
          System.out.println(words[0][1]);
      }
}
