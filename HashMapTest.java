package com.monocept.test;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		HashMap<Integer, String> hashMap2 = new HashMap<>();

		// put
		hashMap.put(1, "Sohan");
		hashMap.put(2, "Mohan");
		hashMap.put(3, "Jeevan");
		hashMap2.put(5, "Bablu");
		System.out.println(hashMap);

		// putAll
		hashMap.putAll(hashMap2);

		// using keySet()
		System.out.println("Keys: " + hashMap.keySet());

		// using values()
		System.out.println("Values: " + hashMap.values());

		// using entrySet()
		System.out.println("Key/Value mappings: " + hashMap.entrySet());

		// change element with key 3
		hashMap.replace(3, "new name");
		System.out.println("HashMap using replace(): " + hashMap);

		// remove element associated with key 3
		String value = hashMap.remove(3);
		System.out.println("Removed value: " + value);

		System.out.println("Updated HashMap: " + hashMap);

		// containsKey
		System.out.println("HashMap contains 1 as key or not ? : " + hashMap.containsKey(1));

		// size
		System.out.println("size of hashmap : " + hashMap.size());

		// isEmpty
		System.out.println("is hashmap empty : " + hashMap.isEmpty());
		
		//clear
		hashMap.clear();
		System.out.println(hashMap);

	}

}
