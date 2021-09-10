package cocoaShop;

public class Trufa extends Produto {
	
	private boolean alcoolica;

	//custom methods
	public void status() {
		System.out.println("**************");
		System.out.println("Sobre a trufa:");
		System.out.println("Sabor: " + this.getSabor());
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Peso: " + this.getPeso() + "g");
		System.out.println("Pre�o: " + this.getPre�o());
		System.out.println("Zero A�ucar: " + this.isZeroA�ucar());
		System.out.println("Zero Lactose: " + this.isZeroLactose());
		System.out.println("Alcoolica: " + this.isAlcoolica()+"\n");
	}
	//special methods
	public Trufa(String sabor, String marca, int peso, double pre�o, boolean zeroA�ucar,
			boolean zeroLactose, boolean comAlcool) {
		
		this.setSabor(sabor);
		this.setMarca(marca);
		this.setPeso(peso);;
		this.setPre�o(pre�o);;
		this.setZeroA�ucar(zeroA�ucar);;
		this.setZeroLactose(zeroLactose);;
		this.setAlcoolica(comAlcool);
	}

	//getters and setters
	
	public boolean isAlcoolica() {
		return alcoolica;
	}

	public void setAlcoolica(boolean alcoolica) {
		this.alcoolica = alcoolica;
	}
}
