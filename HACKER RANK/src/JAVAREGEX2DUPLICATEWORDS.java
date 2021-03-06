import java.util.Scanner;
import java.util.regex.*;
public class JAVAREGEX2DUPLICATEWORDS {

	public static void main(String[] args) {
		  String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
	        Pattern p = Pattern.compile(regex, Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);

	        Scanner in = new Scanner(System.in);
	        int numSentences = Integer.parseInt(in.nextLine());
	        
	        while (numSentences-- > 0) {
	            String input = in.nextLine();
	            
	            Matcher m = p.matcher(input);
	            
	            // Check for subsequences of input that match the compiled pattern
	            while (m.find()) {
	                input = input.replaceAll(m.group(), m.group(1));
	            }
	            
	            // Prints the modified sentence.
	            System.out.println(input);
	        }
	        
	        in.close();

	}

}

/*I used this regular expression: "\b(\w+)(?:\W+\1\b)+"

When using this regular expression in Java, we have to "escape" the backslash characters with additional backslashes (as done in the code above).

\w ----> A word character: [a-zA-Z_0-9]
\W ----> A non-word character: [^\w]
\b ----> A word boundary
\1 ----> Matches whatever was matched in the 1st group of parentheses, which in this case is the (\w+)
+ ----> Match whatever it's placed after 1 or more times

The \b boundaries are needed for special cases such as "Bob and Andy" (we don't want to match "and" twice). Another special case is "My thesis is great" (we don't want to match "is" twice).*/
