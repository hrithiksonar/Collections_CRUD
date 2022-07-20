package com.monocept.test;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// creating a TreeMap
		TreeMap<Integer, String> treeMap1 = new TreeMap<>();
		TreeMap<Integer, String> treeMap2 = new TreeMap<>();

		// add keys and values
		treeMap1.put(1, "Hrithik");
		treeMap1.put(2, "Bittu");
		treeMap1.put(3, "Vikram");
		treeMap2.put(101, "Shukla");
		treeMap2.put(102, "Jaison");

		// display
		System.out.println(treeMap1);
		System.out.println(treeMap2);

		// putAll
		treeMap1.putAll(treeMap2);
		System.out.println(treeMap1);

		// putIfAbsent
		treeMap1.putIfAbsent(102, "Vivek");
		System.out.println(treeMap1);

		// access TreeMap

		// using entry.set
		System.out.println("Key/Value mappings: " + treeMap1.entrySet());
		// using key.set
		System.out.println("Key values: " + treeMap1.keySet());
		// using value.set
		System.out.println("Values: " + treeMap1.values());
		// Using get()
		String value1 = treeMap1.get(1);
		System.out.println("Using get(): " + value1);

		// Using getOrDefault()
		String value2 = treeMap1.getOrDefault(100, "Default value");
		System.out.println("Using getOrDefault(): " + value2);

		// remove
		treeMap2.remove(101);
		System.out.println(treeMap2);
		// remove
		treeMap1.remove(101, "Vikram");
		System.out.println(treeMap1);

		// replace
		treeMap2.replace(102, "Jaison riju");
		System.out.println(treeMap2);
		// replace
		treeMap1.replace(102, "Jaison", "New Jaison");

		// First and Last Methods
		System.out.println("First Key : " + treeMap1.firstKey() + " Last Key : " + treeMap1.firstEntry());
		System.out.println("Last Key : " + treeMap1.lastKey() + " Last Key : " + treeMap1.lastEntry());

	}

}
