import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	
	public static void main(String [] args) {
		
		List<String> names = new ArrayList<String>();
		names.add("Krishna Murthy");
		names.add("Usha Rani");
		names.add("Vijay");
		names.add("Jahnavi");
		names.add("Akshay");
		names.add("Samanvitha");
		names.add("Ajay");
		names.add("Phani Priya");
		
		System.out.println("Before name   "+names);
		
		List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println("##############################");
		
		System.out.println("After name   "+upperCaseNames);
		
	}

}
