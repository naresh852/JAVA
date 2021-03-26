import java.util.Scanner;

public class java {
      public static void main(String [] args) {
//    	  System.out.println("hello world");
    	  Scanner inp = new Scanner(System.in);
    	  String []fruits = new String[3];
    	  for(int i =0;i<fruits.length;i++) {
    		  fruits[i] = inp.nextLine();
    	  }
    	  for(String fruit : fruits) {
    		  System.out.println(fruit);
    	  }
    	  String[] vehicles = {"luna","car","train"};
    	  for(String vehicle : vehicles) {
    		  System.out.println(vehicle);
    	  }
    	  String name;
    	   for(int i =0;i<2;i++) {
    		   String names = inp.next();
    		   System.out.println(names);
    	   }
    	 
          inp.close();
    	  
      }
}
