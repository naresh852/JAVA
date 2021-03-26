import java.util.Scanner;
public class JAVASTRINGSINTRO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a=A.length();
        int b=B.length();
         System.out.println(a+b);
        int comp=B.compareTo(A );
        if(comp < 0){
            System.out.println("yes");
        }else{
             System.out.println("no");   
        }
        char i = A.charAt(0);
        char j = B.charAt(0);
        char ik= Character.toUpperCase(i);
        char ij= Character.toUpperCase(j);
        System.out.println(ik+A.substring(1)+ " "+ij+B.substring(1));
	sc.close();
	}

}
