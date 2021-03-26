package getterssetters;

public class Song {
      private String title;
       private String writer;
       private int time;
	   private static int songcount=0;   
	   
	   public Song(String a,String b,int c) {
		   this.title=a;
		   this.writer=b;
		   this.time=c;
		   songcount++;
		   System.out.println("songcount: "+songcount);
	   }
	   public int getsongcount() {
		   return songcount;
	   }
	   public  void settitle(String a) {
		   this.title=a;
	   }
	   public  void setwriter(String b) {
		   this.title=b;
	   }
	   public   void  settime(int c) {
		   this.time=c;
	   }
	   public String gettitle() {
		   return this.title;
	   }
	   public String getwriter() {
		   return this.writer;
	   }
	   public int gettime() {
		   return this.time;
	   }
	   
	   
	   
	   
}
