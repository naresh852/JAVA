
public class equalsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String str1 = "geeks"; 
			String str2 = "geeks"; 
			String str3 = "ksgee orF geeks"; 

			// if we ignore the cases both the strings are equal. 
			boolean result1 = str2.equalsIgnoreCase(str1); 
			System.out.println("str2 is equal to str1 = " + result1); 

			// even if ignoring the cases both the strings are not equal. 
			boolean result2 = str2.equalsIgnoreCase(str3); 
			System.out.println("str2 is equal to str3 = " + result2); 
		
	}

}
