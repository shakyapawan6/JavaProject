package CollectionPractice;

import java.util.ArrayList;

public class LinkListDemo {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		// Adding elements in ArrayList
		names.add("Pawan");
		names.add("Abhi");
		names.addAll(names);
		names.add("Mannu");

		// get elements
		System.out.println(names.get(1));

		int size = names.size();
		System.out.println("Size of ArrayList is : " + size);

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
