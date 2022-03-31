
public class InnerClassesDemo {
	static class A{
		String name = "Inner Classes Demo by referring the parent class, and then the inner class ie. A(). We have to make A() as static cuz we are creating an object of an inner class inside a static method.";
	}
	
	public static void main(String[] args) {
		InnerClassesDemo.A a = new InnerClassesDemo.A();
		System.out.println(a.name);
	}

}
