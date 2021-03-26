import java.io.BufferedReader;
//import java.io.BufferReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {
        private LinkedList<String> urls = new LinkedList<String>();
        private class UrlIterator implements Iterator<String>{
          private int index =0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index < urls.size();
			}

			@Override
			public String next() {
				StringBuilder sb = new StringBuilder();
				try {
					URL url = new URL(urls.get(index));
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
			String line = null;
			while((line = br.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			br.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				index++;
				return sb.toString();
			}
			@Override
			public void remove() {
				// TODO Auto-generated method stub
				urls.remove(index);
			}
        	
        } 
        public UrlLibrary() {
        	urls.add("http://www.caveofprogramming.com");
        	urls.add("http://www.facebook.com/caveofprogramming");
        	urls.add("http://news.bbc.co.uk");
        	
        }

		@Override
		public Iterator<String> iterator() {
			// TODO Auto-generated method stub
			return new UrlIterator();
		}
//        public String toString() {
//        	return urls.element();
//        }
//		@Override
//		public Iterator<String> iterator() {
//			// TODO Auto-generated method stub
//			return urls.iterator();
//		}
}