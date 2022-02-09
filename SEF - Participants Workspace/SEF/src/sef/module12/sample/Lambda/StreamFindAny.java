package acc.lambda.sample;

import java.util.*; 

public class StreamFindAny {

	    public static void main(String[] args) 
	    { 
	  
	        // Criando uma lista de inteiros 
	        List<Integer> minhaLista = Arrays.asList(2, 4, 6, 8, 10); 
	  
	        // Usando Stream findAny() para retornar 
	        // um Optional que identifica algum elemento 
	        // da stream 
	        Optional<Integer> answer = minhaLista.stream().findAny(); 
	  
	        // se a stream estiver vazia, um  
	        // Optional vazioserá retornado. 
	        if (answer.isPresent()) { 
	            System.out.println(answer.get()); 
	        } 
	        else { 
	            System.out.println("nenhum valor"); 
	        } 
	    } 
}
