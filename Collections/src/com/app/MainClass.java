package com.app;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		/*ArrayList<String> list2 = new ArrayList<>(20);
		ArrayList<Integer> list3 = new ArrayList<>(list1);*/

		list1.ensureCapacity(20);

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(60);
		list1.add(50);
		list1.add(70);
		//to print the list
		System.out.println(list1);
		
		//to print the size of an array
		System.out.println("ArrayList size:"+list1.size());

		//to find whether the element is present or not 
		System.out.println(list1.isEmpty());

		//given element is present in ArrayList or not
		System.out.println(list1.contains(10));
		
		//particular position of an ArrayList
		System.out.println(list1.indexOf(10));
		System.out.println(list1.lastIndexOf(30));
		
		//getting an element at particular position
		System.out.println(list1.get(3));
		System.out.println(list1.get(6));
		
		
		//replace element
		System.out.println(list1.set(4, 100));
		System.out.println(list1.set(1, 90));
		
		System.out.println(list1.remove(4));
		System.out.println(list1);
	}

}
