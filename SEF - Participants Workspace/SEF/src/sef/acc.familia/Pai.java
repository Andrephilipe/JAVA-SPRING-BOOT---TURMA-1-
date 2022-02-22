package acc.familia;

 public class Pai extends Avo {
	private boolean alto;
	 
	public Pai() {
		System.out.println("Contrutor Pai");
	}

	public boolean isAlto() {
		return alto;
	}

	public void setAlto(boolean alto) {
		this.alto = alto;
	}
	
}