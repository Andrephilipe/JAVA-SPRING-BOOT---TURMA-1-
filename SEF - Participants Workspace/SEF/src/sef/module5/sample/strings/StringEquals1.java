package acc.strings.sample;

public class StringEquals1 {
	public static void main(String[] args)
    { 
        String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 

        System.out.println(s1 == s2); // Comparando objetos
        System.out.println(s1.equals(s2)); // Comparando conte�do
    }
}