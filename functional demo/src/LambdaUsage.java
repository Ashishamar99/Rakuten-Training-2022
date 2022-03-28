import java.util.*;

public class LambdaUsage {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(5);
		
		l1.forEach((Integer element)->{
			System.out.println(element);
		});
	}

}
