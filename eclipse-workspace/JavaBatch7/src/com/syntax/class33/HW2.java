package com.syntax.class33;


import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HW2 {

	public static void main(String[] args) {
		Map<String, Double>employees = new LinkedHashMap<>();
		employees.put("Ahmet", 120000.00);
		employees.put("John", 99000.00);
		employees.put("Will", 90000.00);
		employees.put("Bruce", 190000.00);
		Collection<Double>values = employees.values();
		double max =0;
		for(double value :values) {
			if(value>max) {
				max = value;
			}
		}
		System.out.println(max);
		Set<Entry<String, Double>> allEntries = employees.entrySet();
		for (Entry<String, Double> entry :allEntries) {
			if(entry.getValue() == max) {
				System.out.println(entry.getKey() +"=$"+ entry.getValue());
			}
		}
		System.out.println("=======================================");

		Map<String, Integer> emp = new LinkedHashMap<>();
		emp.put("Sumair Jawaid", 150000);
		emp.put("AliJon", 100000);
		emp.put("Asel", 105000);
		emp.put("Sohil", 100000);
		
		Set<Entry<String, Integer>> entry = emp.entrySet();
		
		int largest = 0;
		String name = "";
		
		for (Entry<String, Integer> entry2 : entry) {
			if (entry2.getValue() > largest) {
				largest = entry2.getValue();
				name = entry2.getKey();
			}
		}
		System.out.println(name + "= $" + largest);
		
	}
}
	
