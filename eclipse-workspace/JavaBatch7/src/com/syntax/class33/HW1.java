package com.syntax.class33;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HW1 {

	public static void main(String[] args) {
		Map<String, Integer> cities = new TreeMap<>();
		cities.put("Paris", 5);
		cities.put("Moskow", 6);
		cities.put("Washington DC", 25);
		cities.put("Vienna", 5);
		cities.put("Istanbul", 25);
		cities.put("Cairo", 4);
		cities.put("Kyiv", 2);
		Set<String> keys = cities.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			if (key.length() > 7) {
				it.remove();
			}
		}
		System.out.println(keys);
		System.out.println(cities);
		String[] citi = { "Washington", "Los Angeles", "New York", "Miami", "Dallas","Kabul" };
		Map<String, Integer> cityMap = new TreeMap<>();
        for(String c : citi) {
        	cityMap.put(c, c.length());
        }
        System.out.println(cityMap);
        Iterator <Entry<String, Integer>> iterator = cityMap.entrySet().iterator();
        while(iterator.hasNext()) {
        	Entry<String, Integer>entry= iterator.next();
        	if(entry.getValue()>7) {
        		iterator.remove();
        	}
        }
        System.out.println("Map after removal "+cityMap);
        
	}

}
