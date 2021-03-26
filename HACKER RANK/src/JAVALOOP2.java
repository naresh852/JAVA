import java.util.Scanner;

public class JAVALOOP2 {

	public static void main(String []argh) {
		Scanner i=new Scanner(System.in);
		int t=i.nextInt();
		for(int l=0;l<t;l++) {
			int a=i.nextInt();
			int b=i.nextInt();
			int n=i.nextInt();
			for(int j=0;j<n;j++) {
				a=a+(int)Math.pow(2,j)*b;
				System.out.print(a+" ");
				
			}
			System.out.println("");
		}
		i.close();
		
	}
}
