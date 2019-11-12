
public class DynamicTestA {

	public void foo() {
		System.out.println("A");
	}
	
	public static void main(String[] args) {
		DynamicTestA a = new DynamicTestB();
		a.foo();
	}
}

class DynamicTestB extends DynamicTestA{
	public void foo() {
		System.out.println("B");
	}
}