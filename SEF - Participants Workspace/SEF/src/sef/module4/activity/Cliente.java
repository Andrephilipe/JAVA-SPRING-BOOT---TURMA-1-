package sef.module4.activity;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.time.LocalDateTime;
import java.util.Random;

public class Cliente {
    
    
    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String nome;
        int inicial;
		LocalDateTime data = LocalDateTime.now();
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);
    
        //Obtendo os dados iniciais do Cliente
        JOptionPane.showMessageDialog(null, "Cadastrando novo cliente.");
        nome = JOptionPane.showInputDialog("Entre com seu nome: ");
		//nome = entrada.nextLine();

		conta = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua conta 1 ou 2?"));
		//conta = entrada.nextInt();
        if(conta == 1 ){
			 inicial = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor inicial depositado na conta: "));
			ContaCorrente minhaConta1 = new ContaCorrente(nome,conta, inicial, data);
			minhaConta1.iniciar();
		}else if(conta == 2){
			inicial = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor inicial depositado na conta: "));
			ContaCorrente minhaConta2 = new ContaCorrente(nome,conta, inicial, data);
			minhaConta2.iniciar();
		}
		else{
			JOptionPane.showMessageDialog(null, "Conta inválida.");
		}
    }
    
}
