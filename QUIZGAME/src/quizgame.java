import java.util.Scanner;

public class quizgame {

	public static void main(String[] args) {
		String q1= "what color is an apple?\n"
				+ "(a)red\n(b)black\n(c)blue\n(d)orange";
		String q2="what color are bananas?\n"
				+"(a)green\n(b)magenta\n(c)yellow\n(d)black";
		Questions []questions= {
				new Questions(q1,"a"),
				new Questions(q2,"c")
		};	
		taketest(questions);

	}
	public static void taketest(Questions[]questions) {
		int marks=0;
		Scanner input=new Scanner(System.in);
		for(int i=0;i<questions.length;i++) {
		System.out.println(questions[i].prompt);
		String answ=input.nextLine();
		if(answ.equals(questions[i].ans)) {//answ==questions[i].ans is not working
			marks++;
		}
		}
		System.out.println("you got "+marks+"/2");
		input.close();
	}
	
	
}
