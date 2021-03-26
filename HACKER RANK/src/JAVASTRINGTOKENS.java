import java.util.Scanner;
import java.util.*; 
import java.io.*;
import java.util.Arrays; 
public class JAVASTRINGTOKENS {

	  public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	      s=s.trim();    //removes space in first andlast of string
	        //System.out.println(s.length());
	        String [] strings = s.split("[, ?.@_!']+"); 
	        System.out.println(strings.length);
	        for (String z : strings) 
	            System.out.println(z);

	        scan.close();
	    }

}

//  String[] tokens = s.trim().split("[!,?.*_'@\\ ]+");
