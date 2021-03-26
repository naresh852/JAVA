//import java.util.InputMismatchException;
import java.util.Scanner;

public class TRYCATCHEXPECTION {

	public static void main(String[] args) {
		Scanner i=new Scanner(System.in);
		int []num= {1,2,3};
		try{
			System.out.print(num[5]);
			System.out.print("enter a num: ");
		double j=i.nextDouble();
		System.out.print(j);
		}/*catch(Exception e) {
			System.out.print(e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch (InputMismatchException e) {
			System.out.println(e);
		}catch(Error e) {
			System.out.println(e);
		}*/catch(Throwable e) {
			System.out.println(e);
		}
		i.close();
	}

}
