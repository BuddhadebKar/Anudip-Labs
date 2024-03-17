package Lab11Q2;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Concate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hello");
		al.add(", ");
		al.add("Stream");
		al.add(", ");
		al.add("Api");
		 System.out.println("Original List: " + al);
		 
		 
		 String st = al.stream().collect(Collectors.joining(" /"));
		
		System.out.println("Concatenated String: " + st);
	}

}
