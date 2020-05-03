package lesson_fourteen;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Pizza {
	/*Write a method program that contains a pizza menu - we are interested only in pizza name and it's price. 
	 * For simplification we can assume that all pizzas are sold in the same size and price is an Integer. 
	 * Write a method that takes how much money there is in your wallet and it returns Map of pizzas and their prices, that you can afford.
	 */
	public  void choosePizza(double amountOfMoneyInWallet){
		Map<String, Double> mappizza = new HashMap<String, Double>();
		mappizza.put("Napoletana", 30.1);
		mappizza.put("Nostra", 20.5);
		mappizza.put("Olivia", 25.1);
		mappizza.put("Margaritta", 25.2);
		mappizza.put("Vegetarian", 15.4);
		System.out.println("\n You can order one of this Pizzas: ");
		Map<String, Double> filteredPizza = mappizza.entrySet().stream().filter(map ->  amountOfMoneyInWallet >= map.getValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		filteredPizza.entrySet().forEach(System.out::println);
	}	
}