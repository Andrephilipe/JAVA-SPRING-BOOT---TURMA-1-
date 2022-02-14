package acc.lambda.sample;
import java.util.*; 
public class StreamSort {
  
	    public static void main(String[] args) 
	    { 
	        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4); 
	  
	        System.out.println("A stream oredenada é : "); 
 
	        list.stream().sorted().forEach(System.out::println); 
	    } 
}