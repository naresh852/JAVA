
public class Student {
       String name;
       String major;
       Double gpa;
       //constructor function
       public Student(String a,String b,double c) {
    	   this.name=a;
    	   this.major=b;
    	   this.gpa=c;
       }
       
       public boolean hashonors() {
         	   if(this.gpa>=3.5) {
         		   return true;
         		   
         	   }else {return false;}
    	   
       }
     
}
