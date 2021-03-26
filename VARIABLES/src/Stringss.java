
public class Stringss {
     public static void main(String []args) {
    	 String word="Naresh Reddy Zaresh Teddy";
    	 System.out.println("Naresh Reddy");
    	 System.out.println("Naresh\"Reddy\"");
    	 System.out.println("Naresh"
    			 +" Reddy"
    			  +" is"
    			 +" good boy");
    	 System.out.println(word.toUpperCase());
    	 System.out.println(word.toLowerCase());
    	 System.out.println(word.length());
    	 System.out.println(word.contains("Reddy"));
    	 System.out.println(word.charAt(1));
    	 System.out.println(word.indexOf("eddy"));
    	 System.out.println(word.indexOf("a"));
    	 System.out.println(word.lastIndexOf("a"));
    	 System.out.println(word.lastIndexOf("eddy"));
    	 System.out.println(word.substring(7));
    	 System.out.println(word.substring(7,word.indexOf("Z")));
    	 System.out.println(word.substring(word.indexOf("Z"),word.indexOf("T")));
     }
}
