package sef.module4.activity;

//import sef.module4.activity.Carro;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Marca do veiculo?" );
        String marca = input.next();

        System.out.println("Qual a colorCode?");
        char cor = input.next().charAt(0);

        System.out.println("Qual o price do carro ");
        int val = input.nextInt();

        Carro car1 = new Carro(marca, cor, val);

    }
}
