
public class Iterablee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       UrlLibrary urlLibrary = new UrlLibrary();
//       System.out.println(urlLibrary);
       for(String html : urlLibrary) {
    	   System.out.println(html.length());
    	   System.out.println(html);
       }
	}

}
