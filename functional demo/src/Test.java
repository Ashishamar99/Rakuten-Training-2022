@FunctionalInterface
interface MyFunctionalInterface{
	void count();
}

class Impl1 implements MyFunctionalInterface{

	@Override
	public void count() {
		// TODO Auto-generated method stub
		System.out.println("Called using a class which implements the interface.");
	}
	
}

public class Test {
	public static void main(String[] args) {
		MyFunctionalInterface impl = () -> System.out.println("Called using functional interface.");
		impl.count();
		
		Impl1 impl1 = new Impl1();
		impl1.count();
	}
}
