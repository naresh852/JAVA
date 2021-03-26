import java.io.IOException;

public class app {
      public static void main(String[]args) {
    	  tester t1 = new tester();
    	try {
			t1.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
    	try {
			t1.root();
		} catch (seroeror e) {
			
			System.out.println(e.getMessage());
		}
      }
}
