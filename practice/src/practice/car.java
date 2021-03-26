package practice;

public enum car {
     lambo("lamborgini"),ferrari("ferrarii"),tata("tatagroup");
	 
	private String name;
	car(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "the name of car is "+name;
	}
	
}
