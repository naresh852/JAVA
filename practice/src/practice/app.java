package practice;
public class app{
	public static void main(String[]args) {
		car c1 = car.lambo;
		
		
		
		switch(c1) {
			case lambo:
				System.out.println("its lambo");
				break;
			case ferrari:
				System.out.println("its ferrari");
				break;
			case tata:
				System.out.println("its tata");
				break;
		}
		System.out.println(car.lambo);
		System.out.println(car.lambo.getName());
		System.out.println(car.valueOf("lambo"));
		System.out.println(car.lambo.getClass());
		System.out.println(car.lambo instanceof car);
		
		
	}
}