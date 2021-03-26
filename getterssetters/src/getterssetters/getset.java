package getterssetters;

public class getset {

	public static void main(String[] args) {
		Movie movie1 = new Movie("spider","robin","PG") ;
     
		movie1.setrating("i");
		System.out.println(movie1.getrating());
		System.out.println(movie1.getname());
	}

}
