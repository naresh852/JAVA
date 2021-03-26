//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
/*Java util package contains collection framework, collection classes,
 *  classes related to date and time, event model, internationalization, and miscellaneous
 *  utility classes. On importing this package,
 *   you can access all these classes and methods.*/
import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;

public class javaIFELSE {



    //private static final
    //Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //THIS WILL SKIP INPUT LIKE alphabets,special chracters,alphabetstrings,
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if((N%2) != 0){
             System.out.println("Weird");
        }else if(N%2 == 0 && 2<=N && N<=5){
             System.out.println("Not Weird");
        }else if(N%2 == 0 && 6<=N && N<=20){
            System.out.println("Weird");
        }else if(N%2==0 && N>20){
               System.out.println("Not Weird");
        }


        scanner.close();
    }
}