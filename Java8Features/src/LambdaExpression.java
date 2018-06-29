import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
	
	public static void main(String [] args) {
		
		List<Developer> names = new ArrayList<Developer>();
		names.add(new Developer("Krishna Murthy"));
		names.add(new Developer("Usha Rani"));
		names.add(new Developer("Vijay"));
		names.add(new Developer("Jahnavi"));
		names.add(new Developer("Akshay"));
		names.add(new Developer("Samanvitha"));
		names.add(new Developer("Ajay"));
		names.add(new Developer("Phani Priya"));
		
		names.forEach(System.out::println);
		
		names.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println("###############################");
		names.forEach(System.out::println);
	}

}
