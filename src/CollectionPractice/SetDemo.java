package CollectionPractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;


public class SetDemo {
	public static void main(String[] args) {
		java.util.List<String> aList = new ArrayList<String>();
		java.util.List<String> lList = new LinkedList<String>();
		Set<String> hSet = new HashSet<String>();
		Set<String> LhSet = new LinkedHashSet<String>();
		Set<String> tSet = new TreeSet<String>();
		// adding in Array List
		aList.add("Honda");
		aList.add("BMW");
		aList.add("Audi");
		aList.add("Honda");
        // adding in LinkedList
		lList.add("Honda");
		lList.add("BMW");
		lList.add("Audi");
		lList.add("Honda");
		// adding in HashSet
		hSet.add("Honda");
		hSet.add("BMW");
		hSet.add("Audi");
		hSet.add("Honda");
		//adding in LinkedHashSet
		LhSet.add("Honda");
		LhSet.add("BMW");
		LhSet.add("Audi");
		LhSet.add("Honda");
		//adding in TreeSet
		tSet.add("Honda");
		tSet.add("BMW");
		tSet.add("Audi");
		tSet.add("Honda");	
		System.out.println("........Array List Elements........");
		for (String item : aList) {
			System.out.println(item);
		}
		System.out.println("........Linked List Elements........");
		for (String item : lList) {
			System.out.println(item);
		}
		System.out.println("........Hash Set Elements........");
		for (String item : hSet) {
			System.out.println(item);
		}
		System.out.println("........LinkedHash Set Elements........");
		for (String item : LhSet) {
			System.out.println(item);
		}
		System.out.println("........Tree Set Elements........");
		for (String item : tSet) {
			System.out.println(item);
		}
	}

}
