package sef.module4.activity;
import sef.module4.sample.Shirt;

import java.util.Scanner;

public class DriverShirt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual a descrição da camisa?" );
        String desc = input.next();

        System.out.println("Qual a cor da camisa?");
        char cor = input.next().charAt(0);
       // char cor = (char) System.in.read(); não consegui pegar todos os caracteres nesses scanner

        System.out.println("Qual o preço da camisa? ");
        int val = input.nextInt();
        
        Shirt shirt1 = new Shirt(desc, cor, val);

        System.out.print(shirt1);
        
    }
}
