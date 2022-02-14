package sef.module3.sample;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

import javafx.scene.layout.Border;

public class ChessBoard {
	public static void main(String[] args) {
		
		String[][] board = { 
				{"R","N","B","Q","K","B","N","R"},
				{"P","P","P","P","P","P","P","P"},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{" "," "," "," "," "," "," "," "},
				{"p","p","p","p","p","p","p","p"},
				{"r","n","b","q","k","b","n","r"}};

		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		// Scanner input = new Scanner(System.in);
			String a = JOptionPane.showInputDialog("Hello \nworld ");

			int a1 = Integer.parseInt(a);
		// int a = input.nextInt();

		System.out.println("");
		String peao1 = board[5][7];

		 board[6][7] = peao1; //peao 1
		// board[]
		 board[6][7] = "";

		 imprimirBoard(board);
		}
		
		/*for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }

		 System.out.println("");
		 board[5][2] = board[6][2];
		 board[6][2] = " ";
		 
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
			//imprimirBoard(board);
	}*/
	
	// --------------Impress�o do Tabuleiro---------------------------------------
	public static void imprimirBoard(String[][] board) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
	}

	public static void peao(){
		
	}
}
