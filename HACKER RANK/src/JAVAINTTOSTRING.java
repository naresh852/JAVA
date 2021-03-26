import java.util.Scanner;

public class JAVAINTTOSTRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        String s = ""+n;
        /*String s= n+"";
        String s = String.valueOf(n);*/
       System.out.println(s);
       if (n == Integer.parseInt(s)) {
    	    System.out.println("Good job");
    	   } else {
    	    System.out.println("Wrong answer.");
    	   }
        inp.close();
        }}
  
/*public static void main(String[] args) {

	  DoNotTerminate.forbidExit();

	  try {
	   Scanner in = new Scanner(System.in);
	   int n = in .nextInt();
	   in.close();
	   //String s=???; Complete this line below
	 String s=""+n;
	   //Write your code here

	   
	   if (n == Integer.parseInt(s)) {
	    System.out.println("Good job");
	   } else {
	    System.out.println("Wrong answer.");
	   }
	  } catch (DoNotTerminate.ExitTrappedException e) {
	   System.out.println("Unsuccessful Termination!!");
	  }
	 }
	}

	//The following class will prevent you from terminating the code using exit(0)!
/*	class DoNotTerminate {

	 public static class ExitTrappedException extends SecurityException {

	  private static final long serialVersionUID = 1;
	 }

	 public static void forbidExit() {
	  final SecurityManager securityManager = new SecurityManager() {
	   @Override
	   public void checkPermission(Permission permission) {
	    if (permission.getName().contains("exitVM")) {
	     throw new ExitTrappedException();
	    }
	   }
	  };
	  System.setSecurityManager(securityManager);
	 }
	}*/
