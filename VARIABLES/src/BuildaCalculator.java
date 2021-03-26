import java.util.Scanner;

public class BuildaCalculator {
         public static void main(String []args) {
        	
			Scanner input=new Scanner(System.in);        	 
        	 System.out.println("Enter ur first number:");
        	 int a=input.nextInt();
        	 System.out.println("Enter ur second number: ");
        	 int b=input.nextInt();
        	 System.out.println(a+b);
        	 input.close();
        	 
        	
         }
}
