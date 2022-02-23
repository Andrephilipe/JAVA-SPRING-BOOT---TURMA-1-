package sef.module3.sample;

public class SwitchExemplo2 {
	public static void main(String[] args) {
		int number = 20;
		// expressão switch com valor int
		switch (number) {
		// switch cases sem break
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		default:
			System.out.println("Não em 10, 20 ou 30");
		}
	}
}
