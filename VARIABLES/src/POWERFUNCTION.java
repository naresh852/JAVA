
public class POWERFUNCTION {

	public static void main(String[] args) {
		System.out.println(power(11,2));
	}
	public static int power(int base,int pow) {
		int result=1;
		for(int i=0;i<pow;i++) {
			result=result*base;
		}
		return result;
	}

}
