package cocoaShop;

public class Bombom extends Produto {
	
	private String recheio;


	//custom methods
	public void status() {
		System.out.println("**************");
		System.out.println("Sobre o bombom:");
		System.out.println("Sabor: " + this.getSabor());
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Peso: " + this.getPeso() + "g");
		System.out.println("Preço: " + this.getPreço());
		System.out.println("Zero Açucar: " + this.isZeroAçucar());
		System.out.println("Zero Lactose: " + this.isZeroLactose());
		System.out.println("Recheio: " + this.getRecheio()+"\n");
	}

	//special methods
	public Bombom(String sabor, String marca, int peso, double preço, boolean zeroAçucar,
			boolean zeroLactose, String recheio) {
		
		this.setSabor(sabor);
		this.setMarca(marca);
		this.setPeso(peso);;
		this.setPreço(preço);;
		this.setZeroAçucar(zeroAçucar);;
		this.setZeroLactose(zeroLactose);;
		this.setRecheio(recheio);
	}

	//getters and setters
	
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
}
