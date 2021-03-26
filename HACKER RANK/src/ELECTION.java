//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
public class ELECTION {

	public static void main(String[] args) {
        /* Read input */
		String y=alfaorder("nareshreddy");
//		String x="";
//		
//		
//		char temp = 0;
//		char[] chars = string.toCharArray();
//		for (int i = 0; i < chars.length; i++) {
//				for (int j = 0; j < chars.length; j++) {
//						if (chars[j] > chars[i]) {
//								temp = chars[i];
//								chars[i] = chars[j];
//								chars[j] = temp;
//								
//						}
//				}
//		}
//		for(int i=0;i<chars.length;i++) {
//			x=x+chars[i];
//		}
		System.out.print(y);
		
	}
	public static String alfaorder(String a) {
		   // body
        String x="";
		char temp = 0;
		char[] chars = a.toCharArray();
		for (int i = 0; i < chars.length; i++) {
				for (int j = 0; j < chars.length; j++) {
						if (chars[j] > chars[i]) {
								temp = chars[i];
								chars[i] = chars[j];
								chars[j] = temp;
								
						}
				}
		}
		for(int i=0;i<chars.length;i++) {
			x=x+chars[i];
		}
		
		return x;
		}
}

