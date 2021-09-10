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
		System.out.println("Pre�o: " + this.getPre�o());
		System.out.println("Zero A�ucar: " + this.isZeroA�ucar());
		System.out.println("Zero Lactose: " + this.isZeroLactose());
		System.out.println("Recheio: " + this.getRecheio()+"\n");
	}

	//special methods
	public Bombom(String sabor, String marca, int peso, double pre�o, boolean zeroA�ucar,
			boolean zeroLactose, String recheio) {
		
		this.setSabor(sabor);
		this.setMarca(marca);
		this.setPeso(peso);;
		this.setPre�o(pre�o);;
		this.setZeroA�ucar(zeroA�ucar);;
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
