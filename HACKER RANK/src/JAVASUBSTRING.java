import java.util.Scanner;
public class JAVASUBSTRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String x =S.substring(start,end);
        System.out.println(x);
        in.close();
	}

}
