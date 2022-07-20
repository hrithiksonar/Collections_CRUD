package com.monocept.test;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		LinkedHashMap<Integer, String> numbers = new LinkedHashMap<>(8, 0.8f);

		// put
		linkedHashMap.put(1, "Rohan");
		linkedHashMap.put(2, "Rohit");
		linkedHashMap.put(3, "Ashoke");
		numbers.put(5, "Five");
		numbers.put(6, "Six");
		System.out.println("LinkedHashMap " + linkedHashMap);
		System.out.println("Numbers : " + numbers);

		// putAll
		linkedHashMap.putAll(numbers);

		// Union
		System.out.println("Union of numbers and linkedhashmap " + linkedHashMap);

		// Using entrySet()
		System.out.println("Key/Value mappings: " + numbers.entrySet());

		// Using keySet()
		System.out.println("Keys: " + numbers.keySet());

		// Using values()
		System.out.println("Values: " + numbers.values());

		// Using get()
		String value1 = numbers.get(5);
		System.out.println("Returned Number: " + value1);

		// Using getOrDefault()
		String value2 = numbers.getOrDefault(6,"Six");
		System.out.println("Returned Number: " + value2);
		
		//containsKey
		System.out.println("numbers contains key 5 ? : "+numbers.containsKey(5));
		
		//isempty
		System.out.println("is number empty ?: "+numbers.isEmpty());
		
		//clear
		numbers.clear();
		System.out.println(numbers);

	}

}
