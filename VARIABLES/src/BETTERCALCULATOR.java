import java.util.Scanner;
public class BETTERCALCULATOR {
   public static void main(String[]args) {
	   Scanner KeyboardInput=new Scanner(System.in);
	   System.out.println("Enter first num: ");
	   double num1=KeyboardInput.nextDouble();
	   System.out.println("Enter operator: ");
	   String op=KeyboardInput.next();
	   System.out.println("Enter second num: ");
	   double num2=KeyboardInput.nextDouble();
	   if(op.equals("+")) {
		   System.out.println(num1+num2);}
		   else if(op.equals("-")) {
			   System.out.println(num1-num2);}
		   else if(op.equals("*")) {
			   System.out.println(num1*num2);
	   }else if(op.equals("/")) {
		   System.out.println(num1/num2);
   }else {System.out.println("Invalid operator");}
	   KeyboardInput.close();
   }
}
