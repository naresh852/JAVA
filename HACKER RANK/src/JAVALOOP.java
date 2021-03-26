import java.util.Scanner;

public class JAVALOOP {
    public static final Scanner i= new Scanner(System.in);       
	public static void main(String[]args) {
		int N=i.nextInt();
		i.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for(int i=1;i<11;i++) {
			//System.out.println(N+" x "+i+ " = "+(N*i));
			//System.out.println(N+" x "+i+ " = "+N*i);
			//System.out.printf("%d x %d = %d%n",N,i,N*i);
			System.out.printf("%d x %d = %d\n",N,i,N*i);
		}
		i.close();
	}
}
