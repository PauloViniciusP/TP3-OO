package cocoaShop;
public abstract class Produto {
	private String sabor;
	private String marca;
	private int peso;
	private double preço;
	private boolean zeroAçucar;
	private boolean zeroLactose;
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	public boolean isZeroAçucar() {
		return zeroAçucar;
	}
	public void setZeroAçucar(boolean zeroAçucar) {
		this.zeroAçucar = zeroAçucar;
	}
	public boolean isZeroLactose() {
		return zeroLactose;
	}
	public void setZeroLactose(boolean zeroLactose) {
		this.zeroLactose = zeroLactose;
	}
	
	
}
