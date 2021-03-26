package getterssetters;

public class Ststicattributs {
               public static void main(String []args) {
            	   Song song1=new Song("temper","ajay",300);
            	   Song song2=new Song("sahoo","highet",500);
            	   
            	   System.out.println(song1.getsongcount());
            	   System.out.println(song2.getsongcount());
            	   
            	   Song song3=new Song("darber","loses",560);
            	   System.out.println(song1.getsongcount());
            	   System.out.println(song2.getsongcount());
            	   System.out.println(song3.getsongcount()); 
            	   
               }
	          
}
