package sef.module4.activity;
import java.time.LocalDateTime;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaCorrente {
    private String nome;
    private int conta, saques;
    private double saldo;
    LocalDateTime data;
    Scanner entrada = new Scanner(System.in);
    
    public ContaCorrente(String nome, int conta, int inicial, LocalDateTime data2){
        this.nome=nome;
        this.conta=conta;
        saldo=inicial;
        this.data = data2;
        saques=0;
    }
    
    public void extrato(){
        JOptionPane.showMessageDialog( null,"\tEXTRATO\n"
        + "Nome: " + this.nome + "Número da conta: " + this.conta + 
        "Saldo atual:\n", + this.saldo + 
        "Saques realizados hoje: " + this.saques + "\n", conta);

        
    }
    
    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            JOptionPane.showMessageDialog(null, "Sacado: " + valor);
            JOptionPane.showMessageDialog(null, "Novo saldo: " + saldo + "\n");
        } else {
            JOptionPane.showMessageDialog(null,"Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void depositar(double valor)
    {
        saldo += valor;
        JOptionPane.showMessageDialog(null,"Depositado: " + valor);
        JOptionPane.showMessageDialog(null,"Novo saldo: " + saldo + "\n");
        JOptionPane.showMessageDialog(null,"Data atual: " + data);
    }
    
    public void Transferir(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            JOptionPane.showMessageDialog(null,"Valor transferido :" + valor);
            JOptionPane.showMessageDialog(null, "Saldo atual : " + saldo);
            JOptionPane.showMessageDialog(null, "Data atual: " + data);
        
        }else{
            System.out.println("Saldo insuficiente> ");
            System.out.println("Data atual: " + data);
        }
        
    }
    
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }
    
    public void exibeMenu(){
        System.out.println("Data atual: " + data);

        System.out.println("\t Escolha a opção desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Transferir");
        System.out.println("5 - Sair\n");
        System.out.print("Opção: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double valor;
        
        switch( opcao ){
            case 1:    
                    extrato();
                    break;
            case 2: 
                    if(saques<3){
                        System.out.print("Quanto deseja sacar: ");
                        valor = entrada.nextDouble();
                        sacar(valor);
                    } else{
                        System.out.println("Limite de saques diários atingidos.\n");
                    }
                    break;
                    
            case 3:
                    System.out.print("Quanto deseja depositar: ");
                    valor = entrada.nextDouble();
                    depositar(valor);
                    break;
            case 4:
                    System.out.print("Quanto deseja transferir: ");
                    valor = entrada.nextDouble();
                    Transferir(valor);
                    break;
                    
            case 5: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Opção inválida");
        }
    }
}
