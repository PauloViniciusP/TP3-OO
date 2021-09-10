package cocoaShop;
public abstract class Produto {
	private String sabor;
	private String marca;
	private int peso;
	private double pre�o;
	private boolean zeroA�ucar;
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
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public boolean isZeroA�ucar() {
		return zeroA�ucar;
	}
	public void setZeroA�ucar(boolean zeroA�ucar) {
		this.zeroA�ucar = zeroA�ucar;
	}
	public boolean isZeroLactose() {
		return zeroLactose;
	}
	public void setZeroLactose(boolean zeroLactose) {
		this.zeroLactose = zeroLactose;
	}
	
	
}
