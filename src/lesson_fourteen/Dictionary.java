package lesson_fourteen;

import java.util.HashMap;

public class Dictionary {
	//exercise 4
    public void dictionary(String var){ 
	    // This function prints a translated value from dictionary
        // Creates an empty HashMap 
    	HashMap<String, String> hmap = new HashMap<String, String>();
    	// Adding elements to HashMap
        hmap.put("Mother", "Mutter");
        hmap.put("Father", "Vater");
        hmap.put("Sister", "Schwester");
        hmap.put("Brother", "Bruder");
        hmap.put("Oncle", "Onkel");

        String setedVar= hmap.get(var);  
        
        if ((!hmap.isEmpty()) && (hmap.containsKey(setedVar))) {
        	System.out.println("\nValue for the word " + var + " is " + hmap.get(var));
        }
        else {
        	System.out.println("\nSorry, I don't know such word");}
        }	  
 }