import java.util.*;

public class LambdaUsage {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(5);
		
		l1.forEach((Integer element)->{
			System.out.println(element);
		});
		
		System.out.println("Next we will be using a sort() and a lambda function, a \"Comparator\" to compare and sort.");
		
		l1.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
			
		});
		
		System.out.println(l1);
	}

}
