import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application{
	public static void main(String[]args) throws FileNotFoundException {
//	String filename="C:/Users/nares/Desktop/example.txt";

	String filename="example.txt";
	File filetext = new File(filename);
	Scanner in = new Scanner(filetext);
	while(in.hasNextLine()) {
		String line = in.nextLine();
		System.out.println(line);
	
	}
	in.close();
	}
}