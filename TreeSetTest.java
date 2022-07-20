package com.monocept.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// creation of TreeSet
		TreeSet<Integer> treeSet1 = new TreeSet<>();
		TreeSet<Integer> treeSet2 = new TreeSet<>();

		// adding values
		treeSet1.add(1);
		treeSet1.add(2);
		treeSet1.add(3);
		treeSet2.add(5);
		treeSet2.add(7);
		System.out.println(treeSet1);
		System.out.println(treeSet2);

		// addAll
		treeSet2.addAll(treeSet1);
		System.out.println("TreeSet2 :"+treeSet2);

		// iterate
		Iterator<Integer> iterate = treeSet1.iterator();
		System.out.print("TreeSet1 using Iterator: ");

		// Accessing elements
		while (iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.println();

		// remove
		System.out.println("7 is removed : " + treeSet2.remove(7));

		// removeAll
		System.out.println("remove treeSet1 elements from treeSet2 : "+treeSet2.removeAll(treeSet1));

		//first
		System.out.println("First element of treeset1 : "+treeSet1.first());
		
		//last
		System.out.println("Last element of treeset1 : "+treeSet1.last());
		
		//pollFirst
		System.out.println("Remove First Element : "+treeSet1.pollFirst());
		
		//pollLast
		System.out.println("Remove Last Element : "+treeSet1.pollLast());
		
		System.out.println(treeSet1);
		
		//contains
		System.out.println("treeset1 contains 2 : "+treeSet1.contains(2));
		
		//clear
		System.out.println("TreeSet1 and TreeSet2 cleared ");
		treeSet1.clear();
		treeSet2.clear();
		System.out.println(treeSet1);
		System.out.println(treeSet2);
		
		//isEmpty
		System.out.println(treeSet1.isEmpty());
		
	}

}
