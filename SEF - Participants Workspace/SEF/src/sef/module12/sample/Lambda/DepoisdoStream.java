package acc.lambda.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DepoisdoStream {

    public static void main(String[] args) {
 
        List<String> lines = Arrays.asList("spring", "node", "acc");

        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"acc".equals(line))     
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);                //output : spring, node

    }

}