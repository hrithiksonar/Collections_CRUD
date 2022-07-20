package com.monocept.test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList linkedlist = new LinkedList<Integer>();
		// add
		linkedlist.add(1);
		linkedlist.add(2);
		linkedlist.add(0, 100);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(5);
		System.out.println("LinkedList : " + linkedlist);

		// addLast and addFirst
		linkedlist.addLast(300);
		linkedlist.addFirst(90);

		// offer
		linkedlist.offer(98);

		// offerLast
		linkedlist.offerLast(900);

		// offerFirst
		linkedlist.offerFirst(1000);

		System.out.println("Normal order : " + linkedlist);
		System.out.println("Reverse order");

		// descendingIterator
		Iterator iterator = linkedlist.descendingIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// peek
		System.out.println(linkedlist.peek());
		System.out.println(linkedlist);

		// contains
		System.out.println("LinkedList contains 5 : " + linkedlist.contains(5));
		// get
		System.out.println("element at index 1 : " + linkedlist.get(1));

		// getFirst
		System.out.println("First element : " + linkedlist.getFirst());

		// getLast
		System.out.println("Last element : " + linkedlist.getLast());

		// set
		linkedlist.set(2, 200);
		System.out.println("Set 2nd index element : " + linkedlist);

		// remove
		linkedlist.remove();
		System.out.println("remove without argument : " + linkedlist);
		linkedlist.remove(2);
		System.out.println("after removing 2nd index : " + linkedlist);

		// removeFirst
		linkedlist.removeFirst();
		System.out.println("After removing First Element : " + linkedlist);

		// removelast
		linkedlist.removeLast();
		System.out.println("After removing last Element : " + linkedlist);

		// clone
		LinkedList<Integer> cloned = (LinkedList<Integer>) linkedlist.clone();
		System.out.println("cloned copy : " + cloned);

		// indexOf
		System.out.println("Index of 200 : " + linkedlist.indexOf(200));

		// poll
		System.out.println(linkedlist.poll());
		System.out.println(linkedlist);

		// pollFirst
		System.out.println(linkedlist.pollFirst());

		// pollLast
		System.out.println(linkedlist.pollLast());

		// hashCode
		System.out.println("hashCode : " + linkedlist.hashCode());

	}

}
