package sef.module3.sample;
import java.util.Scanner;  

public class ScannerExemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
       
        int first = input.nextInt();                
        System.out.println("Entre com o segundo número: ");
        
        int second = input.nextInt();              
        
        System.out.println(first + " + " + second + " = " + (first+second));

    }
}
