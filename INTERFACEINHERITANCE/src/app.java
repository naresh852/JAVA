
public class app {

	public static void main(String[] args) {
		/*cow cow1=new cow();
		cow1.eats();
		dog dog1=new dog();
		dog1.eats();
		//the o/p of both above line of code is equals below one
		//but in below we use interface in initialization
		animal cow2=new cow();
		cow2.eats();
		animal dog2=new dog();
		dog2.eats();*/
		///tis is array of animals using animal interface
		animal []animals= {
		     new cow(),
		     new dog(),
		     new bird()
		
	};
		for(int i=0;i<animals.length;i++) {
		     	animals[i].eats();
		     	animals[i].speak();
		}

}}
