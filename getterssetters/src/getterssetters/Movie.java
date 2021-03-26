package getterssetters;

public class Movie {
        private String name;
        private String director;
         private String rating;
         
         public Movie(String a,String b,String r) {
        	 //this will assign a,b,c values to class values indirectly//
        	 //first it will go to methods in class.//
        	setname(a);
        	setdirector(b);
        	setrating(r);
        	 //this will assign a,b,c values to class values directly
        	 /* this.name=a;
        	 this.director=b;
        	 this.rating=r;*/
        	 
         }
         
         public void setname(String a) {
        	 this.name=a;
         }
         public void setdirector(String b) {
        	 this.director=b; 
         }
         public void setrating(String r) {
        	 if(r.equals("PG")||r.equals("UG")||r.equals("U") ){
        	 this.rating =r;
        	 }else {this.rating="invalid input";}
         }
         
         public String getname() {
        	 return this.name;
         }
         public String getdirector() {
        	 return this.director;
         }
         public String getrating() {
        	 return this.rating;
         }
         
         
}
