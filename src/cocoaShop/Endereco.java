package cocoaShop;

public class Endereco {
	private String bairro;
	private String rua;
	private int cep;
	private int numeroCasa;


	//custom methods

	//special methods
	public Endereco(String bairro, String rua, int cep, int numeroCasa) {
		this.bairro = bairro;
		this.rua = rua;
		this.cep = cep;
		this.numeroCasa = numeroCasa;
	}

	//getters and setters
	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(int numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
}
