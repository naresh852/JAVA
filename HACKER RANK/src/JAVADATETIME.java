import java.time.LocalDate;
import java.util.Scanner;
public class JAVADATETIME {

	 public static void main(String[]args) {
		
	     Scanner inp=new Scanner(System.in);
	     int day=inp.nextInt();
	     int month=inp.nextInt();
	     int year =inp.nextInt();
	     
	    System.out.println(findDay(month,day,year));
	     inp.close();}
	 
		public static String findDay(int month, int day, int year) {
		   LocalDate dt = LocalDate.of(year, month, day);
	        return ""+dt.getDayOfWeek();
	        }
	 
		
	}
/*
class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

/*    public static String findDay(int month, int day, int year) {
   LocalDate dt = LocalDate.of(year, month, day);
        return ""+dt.getDayOfWeek();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
*/


