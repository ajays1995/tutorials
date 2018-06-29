
public interface TestInterface {

	default void display() {
		System.out.println("default method");
		display1();
	}
	
	static void display1() {
		System.out.println("static method");
	}
	
	void display3();
}