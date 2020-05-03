package lesson_fourteen;

import java.util.Map;
import java.util.HashMap;

public class Employees {
	
	public void employeeID() {
		// creating new map
		Map<String, String> map = new HashMap<>();
			map.put("a1234", "Steve Jobs");
			map.put("a1235", "Bill Gates");
			map.put("a1236", "Jeff Bezos");
			map.put("a1237", "Larry Page");
			map.put("a1238", "Sergey Brin");
		
		// iterating over map
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + ":" + entry.getValue()+"\n");
		    
		}
	}
}
