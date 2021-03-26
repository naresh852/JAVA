import java.util.Scanner;

public class IFELSE {
  public static void main(String[]args) {
	  Scanner i=new Scanner(System.in);
	  boolean ismale;
	  boolean istall;
	  ismale=i.nextBoolean();
	  istall=i.nextBoolean();
	  if(ismale && istall) {
		  System.out.println("you are tall male");
	  }else if(!ismale && istall) {
		  System.out.println("you are not male but tall");
	  }else if(ismale && !istall) {
		  System.out.println("you are  male but not tall");
	  }else {
		  System.out.println("you are  not male not tall");  
	  }
	  i.close();
  }
}
