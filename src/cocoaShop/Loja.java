package cocoaShop;

public class Loja {
	private String nomeFranquia;
	private double lucro;
	private Endereco enderecoLoja;



	//custom methods

	//special methods
	public Loja(String nomeFranquia, double lucro, Endereco enderecoLoja) {
		this.nomeFranquia = nomeFranquia;
		this.lucro = lucro;
		this.enderecoLoja = enderecoLoja;
	}

	//getters and setters
	public String getNomeFranquia() {
		return nomeFranquia;
	}
	
	public void setNomeFranquia(String nomeFranquia) {
		this.nomeFranquia = nomeFranquia;
	}
	public double getLucro() {
		return lucro;
	}
	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	public Endereco getEnderecoLoja() {
		return enderecoLoja;
	}
	public void setEnderecoLoja(Endereco enderecoLoja) {
		this.enderecoLoja = enderecoLoja;
	}
}
