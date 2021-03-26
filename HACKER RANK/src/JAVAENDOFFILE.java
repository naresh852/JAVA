import java.util.Scanner;

public class JAVAENDOFFILE {

	public static void main(String[] args) {
		 //Scanner sc= new Scanner(System.in);
Scanner scan= new Scanner(System.in);
         int l=1;
         while(scan.hasNextLine()) {
        	 System.out.println(l+" "+scan.nextLine());
        	 l++;
         }
        /* for(int i = 1; scan.hasNextLine(); i++){
       System.out.println(i + " " + scan.nextLine());
   }*/
          /*for(int i=1;i<10000;i++) {
        	  String j=sc.nextLine();
        	  if(j.contains(".")) {
        		  System.out.println(i+" "+j);
        		  i=11000;
        	  }else {
        		  System.out.println(i+" "+j);
        		  
        	  }
        	  
          }
          sc.close();*/
         scan.close();
	}

}
