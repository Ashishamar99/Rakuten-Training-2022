import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>(); // HashSet doesn't save elements in order.
		for (int i = 0; i < 100; i++) {
			names.add("Ram" + i);
		}
		System.out.println(names);

		
		//TreeSets save elements in order, while saving itself.
		Set<String> TreeSetnames = new TreeSet<>();
		for (int i = 1; i < 100; i++) {
			TreeSetnames.add("Ram" + i);
		}
		TreeSetnames.add("Ram0");
		System.out.println(TreeSetnames);
	}
}
