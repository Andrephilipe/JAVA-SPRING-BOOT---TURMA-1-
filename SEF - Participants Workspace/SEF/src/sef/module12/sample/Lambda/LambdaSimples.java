package acc.lambda.sample;

public class LambdaSimples {

	interface Sayable{  
		public String say();  
	}  

	public static void main(String[] args) {
		
		Sayable s = ()->{return "I have nothing to say.";}; 
		
		System.out.println(s.say());  
	}
	
}