
public class TestInterfaceClass implements TestInterface {

	@Override
	public void display3() 
	{
		System.out.println("normal method");
	}
	
	@Override
	public void display()
	{
		System.out.println("display from class");
	}
	
	public void display1()
	{
		System.out.println("class method");
	}
	
	public static void main(String [] args) {
		
		TestInterfaceClass c = new TestInterfaceClass();
		c.display();
		c.display3();
		c.display1();	
	}

}
