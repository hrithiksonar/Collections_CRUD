package com.monocept.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(10, 9, 8));

		LinkedHashSet<Integer> rollno = new LinkedHashSet<>();

		// add
		rollno.add(1);
		rollno.add(2);
		rollno.add(3);
		rollno.add(0);
		rollno.add(null); // LinkedHashSet allows null value insertion
		System.out.println(rollno);

		// remove
		rollno.remove(2);
		System.out.println("After removing 2 from LinkedHashSet : " + rollno);

		// contains
		System.out.println("\nLinkedHashSet contains 0 : " + rollno.contains(0));

		// addAll
		rollno.addAll(arraylist);

		// display
		display(rollno);

		// retainAll
		rollno.retainAll(arraylist);

		display(rollno);

		// remove All
		rollno.removeAll(arraylist);

		// display
		display(rollno);

		// Iterate
		Iterator iterate = rollno.iterator();
		System.out.println("\nIterate by Iterator\n-----------------------");
		while (iterate.hasNext()) {
			System.out.println("Value : " + iterate.next());
		}
	}

	private static void display(LinkedHashSet<Integer> rollno) {
		System.out.println("\nIterate by For-Each\n---------------------");
		for (Integer i : rollno) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
