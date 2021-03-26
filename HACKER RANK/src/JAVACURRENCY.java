//import java.io.*;
//import java.util.*;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;

public class JAVACURRENCY {
	public static void main(String[] args) {
        /* Read input */
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        
        scanner.close();        

        /* Create custom Locale for India. 
          I used the "IANA Language Subtag Registry" to find India's country code */
       /* Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
      /*  NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
      //  NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        //NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        //NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);*/
       Locale locindia = new Locale("en","ind");
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
      
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String India = NumberFormat.getCurrencyInstance(locindia).format(payment);
        String india=India.substring(1);
       // boolean u = france.contains("?");
       // char l = france.charAt(1);
       // String france = "12345?.56";
        for(int i=0;i<france.length();i++){
        char firstValue = france.charAt(i);
        char secondValue = '?';
        // compare the first char to the second
        	int comp = Character.compare(firstValue, secondValue);
        	if (comp == 0) {
                 String x = france.replace('?', ' ');
        	 System.out.println("Value 1 is greater than the value 2. "+x);
        	}
        	else {
        	 System.out.println("else value");
        		}
        }
        String s1 = String.valueOf(france);
        System.out.println(s1); 
       // String s1=" "+france;
           // String z= france.replace("?", " ");
            //String s1= "1?23.45";
            String replaceString=s1.replace('?',' ');//replaces all occurrences of a to e  
            System.out.println(replaceString);  
//             char l = india.charAt(0);
//              india.replace(india.charAt(0),'r');
              /* Print output */  
       
                /*  
              System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
              System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
              System.out.println("China: " + NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
              System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
              /**/
        System.out.println(france.contains("?"));
        System.out.println(france.charAt(1));
        System.out.println(france.charAt(2));
        System.out.println("US: "     + us);
        System.out.println("India: Rs."  + india);
        System.out.println("China: "  + china +france);
        System.out.println("France: " + replaceString);
     
    }

}

/*Scanner scanner = new Scanner(System.in);
double payment = scanner.nextDouble();

scanner.close();        


Locale locindia = new Locale("en","ind");
String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
String India = NumberFormat.getCurrencyInstance(locindia).format(payment);
String india=India.substring(1);
String x = france.replace("?", " ");

System.out.println("US: "     + us);
System.out.println("India: Rs."  + india);
System.out.println("China: "  + china);
System.out.println("France: " + x);

}*/
