package lesson_fourteen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Students {


	    public void studentsFromOurGroup() {
	        HashMap<String, String> students = new HashMap<>();
	        students.put("Olgierd", "Poland");
	        students.put("Olumide", "Nigeria");
	        students.put("Oleg", "Belarus");
	        students.put("Michael", "Germany");
	        students.put("Liubomyr", "Ukraine");
	        students.put("Florian", "Austria");

	        students.forEach(
	                (key, value) -> System.out.println("name: " + key + "; country: " + value)
	        );

	        Set<String> countries = new HashSet<>(students.values());
	        System.out.println("Our students come from " + countries +"\n");

	}
	
	
	
	
	
	
	
	
	
	
	
	
}
