import java.util.Scanner;
//import java.util.*; 
//import java.io.*;
public class JAVAANAGRAMS {
	 public  static boolean isAnagram(String a, String b) {
	        // Complete the function
	        // String ana="Anagram";
	        boolean result=true;
	         int le=a.length();
	         int lb=b.length();
	         
	         String lowb=b.toLowerCase();
	         String lowa=a.toLowerCase();
	         if(le != lb) {
	             result= false; 
	         }else if(le == lb){
	           String ax=alfaorder(lowa);
	           String bx=alfaorder(lowb);
	           int comp=ax.compareTo(bx);
	           if(comp == 0){
	            result=true;
	           }else{result=false;}
	         }else{result=false;}
	             return result;
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
	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	        
	}
//ARRANG STRING IN ALPHABETICAL ORDEER
//c++ lang
//char string[100];
//printf("\n\t Enter the string : ");
//	scanf(“%s”,string);
//char temp;
//int i, j;
//int n = strlen(string);
//for (i = 0; i < n-1; i++) {
//	for (j = i+1; j < n; j++) {
//		if (string[i] > string[j]) {
//				temp = string[i];
//				string[i] = string[j];
//				string[j] = temp;
//		}
//	}
//}
//
//printf(“The sorted string is : %s”, string);
//return 0;
//}

//JAVA ANAGRAMS SOLUTION FROM DISCUSSIONS,COMPARING a-z
/*if (a.length() != b.length()) {
    return false;
}
a = a.toLowerCase();
b = b.toLowerCase();
int sum = 0;
for (char c = 'a'; c <= 'z'; c++) {
    for (int i=0; i<a.length(); i++) {
        if (a.charAt(i) == c) {
            sum++;
        }
        if (b.charAt(i) == c) {
            sum--;
        }
    }
    if (sum != 0) {
        return false;
    }
}
return true;*/


