package com.monocept.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {
	private static void iterate(ArrayList<Integer> arraylist) {
		Iterator<Integer> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		System.out.println(arraylist);
		ListIterator<Integer> listIterator = arraylist.listIterator(arraylist.size());
		while (listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " ");
		}
		System.out.println();
		Enumeration e = Collections.enumeration(arraylist);
		while (e.hasMoreElements()) {

			System.out.print(e.nextElement() + " ");
		}
		System.out.println();

		// add
		arraylist.add(4);
		arraylist.add(0, 2);
		arraylist.add(1);
		System.out.println(arraylist);

		// iterate
		iterate(arraylist);

		for (int i = 0; i < arraylist.size(); i++) {
			if (i == 1) {
				arraylist.remove(i);

			}
			System.out.println(arraylist.get(i));

		}
		iterate(arraylist);
		arraylist.remove(new Integer(2));
		System.out.println(arraylist);

		// remove
		arraylist.remove(new Integer(1));
		System.out.println("ArrayList after removing index 1 : " + arraylist);

		// contains
		System.out.println("Arraylist contains 3 : " + arraylist.contains(3));

		// size 
		System.out.println("size of the arraylist : " + arraylist.size());

		// indexOf 
		System.out.println("Index value of 2 : " + arraylist.indexOf(2));

		// lastIndexOf
		arraylist.add(2);
		System.out.println("Last index of 2 : " + arraylist.lastIndexOf(2));

		// toArray
		Object[] array = arraylist.toArray();
		for (Object s : array) {
			System.out.print(s + " ");
		}
		System.out.println();

		// subList
		System.out.println(arraylist.subList(0, 2));

		// ensureCapacity a
		arraylist.ensureCapacity(20);
		System.out.println(arraylist);

		// clear
		arraylist.clear();
		System.out.println("After clear arraylist : " + arraylist);

	}
}
