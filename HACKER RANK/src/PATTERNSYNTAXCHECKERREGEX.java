import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.*; 
import java.io.*;
public class PATTERNSYNTAXCHECKERREGEX {
//this deals with checking regex pattern valid or not
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//int testCases = Integer.parseInt(in.nextLine());
		//working only after we give spaceeg: 3 ([A-Z])(.+)
		int testCases = in.nextInt();  //not working
		//int testCases = 3;
		while(testCases>0){
			
		try{
			String pattern = in.nextLine();
			System.out.println(pattern);
            Pattern.compile(pattern);
            System.out.println("Valid");
            
          	//Write your code
        }catch(Exception e){
        	
           System.out.println("Invalid");
        }
		testCases--;
		}
	}

}

