//import java.lang.*; 
//import java.io.*; 
import java.util.*; 
public class REVERSESTRING {
	public static void main(String[] args) 
    { 
		Scanner inp = new Scanner(System.in);
        String input = inp.next(); 
  
        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
        System.out.println(input1); 
        inp.close();
    } 
}

// ARRANGE A STRING IN ALPHABETICAL ORDER
//String str;
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter the string : ");
//str = sc.nextLine();
//int j = 0;
//char temp = 0;
//char[] chars = str.toCharArray();
//for (int i = 0; i < chars.length; i++) {
//		for (j = 0; j < chars.length; j++) {
//				if (chars[j] > chars[i]) {
//						temp = chars[i];
//						chars[i] = chars[j];
//						chars[j] = temp;
//				}
//		}
//}
//System.out.println("The sorted string is : ");
//for (int i = 0; i < chars.length; i++) {
//System.out.print(chars[i]);
//}