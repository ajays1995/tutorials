import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAndFilters {
	
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
		
		List<String> n = names.stream()
				 .map(Developer::getName)
				.filter(name1->name1.toLowerCase().contains("a"))
				.collect(Collectors.toList());
		
		n.forEach(System.out::println);
	}

}
