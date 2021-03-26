import java.util.Scanner;

public class GUESSINGGAMENUMBERS {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int secnum=5;
		int guess = 0;//initialize ints like this
		int guessno=0;
		int guesslimit=3;
		boolean outofguess=false;
		while(guess!=secnum && !outofguess) {
			if(guessno < guesslimit) {
				System.out.print("enter your guess: ");
				guess=i.nextInt();
				guessno++;
			}else {outofguess=true;}
			
		}
		if(outofguess) {
			System.out.print("you are outofguesses ");
			
		}else {System.out.print("you won ");}
i.close();
	}

}
