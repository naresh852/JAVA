import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Gettinginput {
      public static void main(String []args) {
    	  Scanner inp = new Scanner(System.in);
    	  System.out.print("enter ur name: ");
    	  String name=inp.nextLine();
    	  System.out.print("enter ur age: ");
    	  int age=inp.nextInt();
    	  System.out.println("your "+name+" "+age+" years old");
    	  inp.close();
    	  
      }
}
