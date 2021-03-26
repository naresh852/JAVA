import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
public class complexdatastructures {
        
	public static String[] vehicles ={
		"ambulance","helicopter","lifeboat"
	};
	public static String[][] drivers = {
			{"Fred","Sue","Pete"},
			{"Sue","Richard","Bob","Fred"},
			{"Pete","Mary","Bob"},
	};
	public static void main(String[] args) {
		System.out.println(drivers[0][0]);
		Map<String,Set<String>> personal = new HashMap<String,Set<String>>();
		for(int i = 0;i<vehicles.length; i++) {
			String vehicle = vehicles[i];
			String driversList[] = drivers[i];
			Set<String> driversSet = new LinkedHashSet<String>();
			for(String driver : driversList) {
				driversSet.add(driver);
			}
			personal.put(vehicle, driversSet);
		}//example usage 
		{//extra brackets to scope driverslist variable so that we can use it later
		Set<String> driversList = personal.get("helicopter");
		for(String driver:driversList) {
			System.out.println(driver);
		}
		}
		//iterate through loop
		for(String vehicle : personal.keySet()) {
			System.out.print(vehicle);
			System.out.print(":");
			Set<String> driversList = personal.get(vehicle);
			for(String driver:driversList) {
				System.out.print(driver);
				System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
