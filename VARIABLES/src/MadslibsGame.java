import java.util.Scanner;

public class MadslibsGame {
   public static void main(String[]args) {
	   Scanner inp=new Scanner(System.in);
	   System.out.println("Enter your flower: ");
	   String flower=inp.nextLine();
	   System.out.println("Enter your fruit: ");
	   String fruit=inp.nextLine();
	   System.out.println("Enter your celebrity: ");
	   String celebrity=inp.nextLine();
	   System.out.println("you love "+flower+"\n"
			              +fruit+" are blue \n"
			              +"you love " +celebrity);
	   inp.close();
   }
   
}
