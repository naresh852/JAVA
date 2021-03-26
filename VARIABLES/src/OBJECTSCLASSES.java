
public class OBJECTSCLASSES {
               public static void main (String[]args) {
	         Student Student1=new Student();
	         Student1.firstname="augusth";
	         Student1.lastname="reddy";
	         Student1.gpa=4.25;
	         Student1.age=12;
	         Student1.pass=true;
	         System.out.println(Student1.firstname);
	         
	         Book book1=new Book("monk who sold his ferrari","naresh",300,"English",1022020);
	         /*book1.name="monk who sold his ferrari";
	         book1.author="naresh";
	         book1.pages=300;
	         book1.language="English";
	         book1.publisheddate=1022020;*/
	         System.out.println(book1.name);
	         System.out.println(book1.publisheddate);
	         CONSTRUCTOR con1=new CONSTRUCTOR("elephant","london",250,"japanese",22022020);
	        	 
	         System.out.println(con1.name);
	         System.out.println(con1.publisheddate); 
	         
	         
}
}
