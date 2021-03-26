import java.util.Scanner;

public class GUESSINGGAME {

	public static void main(String[] args) {
	Scanner i=new Scanner(System.in);
		String secword="giraffe";
		
		String guess="";//initialize strings like this//
		boolean outofguess=false;
		int guesslimit=3;
		int guesscount=0;
		while(!guess.equals(secword) && !outofguess) {
			
			if(guesscount < guesslimit) {
				System.out.print("enter your guess: ");
				 guess=i.nextLine();
				 guesscount++;
			}else {outofguess=true;}
			
		}
		if(outofguess) {
			System.out.print("you ran outofguesses");	
		}else {System.out.print("you won");};
		
		
i.close();		
}}