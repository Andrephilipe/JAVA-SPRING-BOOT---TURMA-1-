package sef.module5.sample.strings;

import java.util.Scanner;

public class StringParaInteiro {

	public static void main(String[] args) {
		
		System.out.println("informe um valor inteiro:");
		System.out.println("");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine(); /* Vai pegar tudo at� a primeira quebra de linha.
                                      Garanta que o n�mero � v�lido!
                                   */
        try {
               int i = Integer.parseInt(str); // Caso voc� queira tipo int, que � o usual.
               long l = Long.parseLong(str); /* � essencialmente a mesma coisa que o int, mas tem um
                                                  limite de dados maior que o int, por consumir mais
                                                  mem�ria para a vari�vel, e, por consequ�ncia um limite
                                                  superior maior para o valor da vari�vel.
                                               */
        } catch (NumberFormatException e) {
              System.out.println("Numero com formato errado!");
        } finally {
          s.close(); //fechar o Scanner para gerenciar melhor a mem�ria.
        }
	}

}
