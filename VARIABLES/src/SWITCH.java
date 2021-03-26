
public class SWITCH {

	public static void main(String[] args) {
		System.out.println(name(1));

	}
	public static String name(int day) {
		String  dayname;
		switch(day){
			case 0:
				dayname="Sunday";
			break;
			case 1:
				dayname="Monday";
			break;
			case 2:
				dayname="tuesday";
			break;
			case 3:
				dayname="wednesday";
			break;
			case 4:
				dayname="thursday";
			break;
			case 5:
				dayname="friday";
			break;
			case 6:
				dayname="saturday";
			break;
			default:
				dayname="invalid input";
			break;
		}
		return dayname;
		
	}

}
