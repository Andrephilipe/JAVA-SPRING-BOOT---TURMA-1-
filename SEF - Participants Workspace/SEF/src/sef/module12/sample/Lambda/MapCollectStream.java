package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapCollectStream {

	public static void main(String[] args) {

	List<String> names = Arrays.asList("Joe", "Kholi", "Sharma");
 
	System.out.println("Using Imperative Style");
	// Imperative Style
	System.out.println("Imperative Style");
	for (String name : names) {
	    if (!name.equals("Joe")) {
	      Student student = new Student(name);
	      System.out.println(student);
	   }
	 }

	// Functional Style
	System.out.println("Functional Style");
	// Basically we are converting the stream into a type of Student using map
	System.out.println("Using Functional Interface --Refactoring Level 1");

	names.stream()
		 .filter(MapCollectStream::isNotJoe)
		 .map(new Function<String, Student>() {	
			 @Override
			 public Student apply(String name) {
				 	Student student = new Student(name);
				 	return student;
				 }
		 	})
		 .forEach(System.out::println);

	System.out.println("Using Lambda Expression --Refactoring Level 2");

	   names.stream()
	   		.filter(MapCollectStream::isNotJoe)
	        .map(name -> {
	        		Student student = new Student(name);
	        		return student;
	        	})
	        .forEach(System.out::println);

	System.out.println("Using Method reference--Refactoring Level 3");

	// Whatever argument comes will be passed to the new Instance of the user
	names.stream()
	     .filter(MapCollectStream::isNotJoe)
	     .map(Student::new)
	     .forEach(System.out::println);

	//Using Collect terminal operation
	List filteredStudent =
	   names.stream()
	        .filter(MapCollectStream::isNotJoe)
	        .map(Student::new)
	        .collect(Collectors.toList());
	 }

	private static boolean isNotJoe(String name) {
	     return !name.equals("Joe");
	}

}