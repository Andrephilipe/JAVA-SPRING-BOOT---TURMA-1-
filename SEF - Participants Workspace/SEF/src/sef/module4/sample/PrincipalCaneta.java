package sef.module4.sample;

public class PrincipalCaneta {

	public static void main(String[] args) {
		Caneta canetaTipo = new Caneta();
		canetaTipo.setCor("Azul");
		canetaTipo.setMarca("Bic");
		canetaTipo.setTampada(true);
		canetaTipo.setVazia(false);
		
//		canetaTipo.Exibir();

		Caneta canetaTipo2 = new Caneta();
		canetaTipo2.setCor("Vermelha");
		canetaTipo2.setMarca("Bic");
		canetaTipo2.setTampada(true);
		canetaTipo2.setVazia(false);
		
		canetaTipo2.Destampar();
		canetaTipo2.Riscar();
	}
}
