package CollectionPractice;

import java.util.LinkedList;

public class ArrayListDemo {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<String>();
		// Adding elements in ArrayList
		names.add("Pawan");
		names.add("Abhi");
		names.addAll(names);
		names.add("Mannu");

		// get elements
		System.out.println(names.get(1));

		int size = names.size();
		System.out.println("Size of LinkedList is : " + size);

		// iterate

		for (int i = 0; i < size - 1; i++) {
			System.out.println(names.get(i));
		}
		System.out.println("\n Iterate using advance for loop");

		for (String name : names) {
			System.out.println(name);
		}
		// remove
		names.remove(size - 1);
		System.out.print(names);
	}

}
