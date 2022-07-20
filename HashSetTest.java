package com.monocept.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void iterate(HashSet hashset) {
		Iterator<String> iterator = hashset.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void main(String[] args) throws ClassCastException {
		Class pointer = HashSet.class;
		System.out.println("Parent class of HashSet : " + pointer.getSuperclass());
		HashSet<String> hashset = new HashSet<String>();

		// Add method
		hashset.add("Hrithik");
		hashset.add("Rohan");
		hashset.add("Koushik");

		// Add duplicate element in hashset
		hashset.add("Rohan");
		hashset.add("hrithik");

		// Iterator Forward
		iterate(hashset);

		// remove
		hashset.remove("hrithik");
		iterate(hashset);
		// size
		System.out.println("Size of the hashset : " + hashset.size());
		// contains
		System.out.println("HashSet conatins Hrithik : " + hashset.contains("Hrithik"));
		// clone
		HashSet hashsetcloned = (HashSet) hashset.clone();
        //iterate	 
		iterate(hashsetcloned);

        //equals 
		System.out.println(hashset.equals(hashsetcloned));

		// retainAll hashsetcloned.remove("Koushik");
		hashset.retainAll(hashsetcloned);
		System.out.println();

		iterate(hashset);
		System.out.println();

        // toArray without argument 
		Object[] stringArray = hashset.toArray();
		for (Object e : stringArray) {
			System.out.println(e);
		}

		// toArray(T[] hashsetName) with arguments
		String[] hashset1 = new String[2];
		hashset.toArray(hashset1);
		System.out.println("\ncopied array :");
		for (String e : hashset1) {

			System.out.println(e);
		}

		// hashcode
		System.out.println("\nHashSet hashCode : " + hashset.hashCode());
		System.out.println("CopiedArray HashSet hashCode : " + hashset1.hashCode());

	}

}
