package Lab11Q1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("apple");
		al.add("banana");
		al.add("orange");
		al.add("grapes");
		al.add("apple");
		al.add("mangoes");
		al.add("apple");
		
		System.out.println("Original List of numbers: " + al);
		Set<String> set = new LinkedHashSet<String>();
	    set.addAll(al);
	    al.clear();
	    al.addAll(set);
	    System.out.println("ArrayList without duplicate elements: " + al);

	}

}
