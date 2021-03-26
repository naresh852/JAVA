import java.util.Scanner;
public class JAVASUBSTRINGCOMP {
          
	 public static String getSmallestAndLargest(String s, int k) {
	       
		 int l= s.length();
         String []str = new String[l+1-k];
         
         for(int i=0;i<=l-k;i++) {
             str[i]=s.substring(i,i+k);
             }
       String smallest = s.substring(0,k);
       String largest  = s.substring(0,k);
       for(int i=0;i<s.length()-k+1;i++){
    	   if(str[i].compareTo(smallest) <0) smallest = str[i];
           if(str[i].compareTo(largest) >0) largest = str[i];   
       //if(s.substring(i,i+k).compareTo(smallest) <0) smallest = s.substring(i,i+k);
       //if(s.substring(i,i+k).compareTo(largest) >0) largest = s.substring(i,i+k); 
     }
	       return smallest + "\n" + largest;
	    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
	}

}
