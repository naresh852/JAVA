import java.util.Scanner;

public class JAVADATATYPES {
	public static void main(String []argh) {
		Scanner k=new Scanner(System.in);
		int h=k.nextInt();
		for(int i=0;i<h;i++) {
		try {
			long l=k.nextLong();
			System.out.println(l+"can be fitted");
			 
				if(l>=Byte.MIN_VALUE && l<=Byte.MAX_VALUE) 
				{System.out.println("* Byte");}
			
			if(l>=Short.MIN_VALUE && l<=Short.MAX_VALUE) 
			{System.out.println("* Short");}
		
		if(l>=Integer.MIN_VALUE && l<=Integer.MAX_VALUE) 
		{System.out.println("* Integer");}
	   
	if(l>=Long.MIN_VALUE && l<=Long.MAX_VALUE) 
	{System.out.println("* Long");}}
   
		
		catch(Exception e) {
		System.out.println(k.next()+"cant be fitted anywhere");
		}
		}
	k.close();	
	}
	
	}
