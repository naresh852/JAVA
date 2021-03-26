import java.util.Scanner;
public class JAVASTRINGREVERSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
      
        StringBuilder rev = new StringBuilder();
        rev.append(A);
        rev=rev.reverse();
        String B=""+rev;
        int comp = A.compareTo(B);
        if(comp == 0){
          System.out.println("Yes");
        }else{ System.out.println("No");}
      sc.close();
	}

}











// HOW TO REVERSE A STRING WITHEMPTY STRING
/*
String rev = "";
for(int i=A.length()-1;i>=0;i--)
    rev+=A.charAt(i);
if(rev.equals(A))
    System.out.println("Yes");
else
            System.out.println("No");*/

//HOW TO COMPARE IGNORE UPPERCASE,AND REVERSE STRING ,CONVERT TO STRING
/*
if(A.equalsIgnoreCase(new StringBuffer(A).reverse().toString()))
    System.out.println("Yes");
else
    System.out.println("No");*/