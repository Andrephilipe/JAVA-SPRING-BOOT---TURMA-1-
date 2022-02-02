package sef.module3.sample;
import java.util.Scanner;

public class ScannerAtividade1 {
    public static void main(String[] args) {
        int VA = 50, VB = 30, VC = 20;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos ingressos da classe A foram vendidos:"); 
        int QA = input.nextInt() * VA; 

        System.out.println("Digite quantos ingressos da classe B foram vendidos:"); 
        int QB = input.nextInt() * VB; 

        System.out.println("Digite quantos ingressos da classe C foram vendidos:"); 
        int QC = input.nextInt() * VC;
        
        double total = QA + QB + QC;
        System.out.printf("Total de receita: R$ %.2f" , total); 
    }
    
}
