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
		System.out.println("Preço: " + this.getPreço());
		System.out.println("Zero Açucar: " + this.isZeroAçucar());
		System.out.println("Zero Lactose: " + this.isZeroLactose());
		System.out.println("Alcoolica: " + this.isAlcoolica()+"\n");
	}
	//special methods
	public Trufa(String sabor, String marca, int peso, double preço, boolean zeroAçucar,
			boolean zeroLactose, boolean comAlcool) {
		
		this.setSabor(sabor);
		this.setMarca(marca);
		this.setPeso(peso);;
		this.setPreço(preço);;
		this.setZeroAçucar(zeroAçucar);;
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
