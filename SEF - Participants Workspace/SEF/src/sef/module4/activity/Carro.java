package sef.module4.activity;

public class Carro {
    public String marca;
	public char colorCode;
	public double price;

    public Carro(String marca, char colorCode, double price) {
		this.marca = marca;
		this.colorCode = colorCode;
		this.price = price;
        Exibir();
        Buzinar();
	}
    public void Exibir() {
		System.out.println("Nome da marca: " + marca);
		System.out.println("Color code: " + colorCode);
		System.out.println("Preço do carro: "+ price);
		System.out.println("---------------------------------------------");
	}
    public void Buzinar(){
        System.out.println("Emitir som de buzina! ");
    }
}
