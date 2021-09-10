package cocoaShop;
public class Telefone {
	private int numDDD;
	private int numero;
	private String tipoTelefone;
	private String numCompleto;

	//custom methods
	
	//special methods
	public Telefone(String tipoTelefone, int numDDD, int numero) {
		this.tipoTelefone = tipoTelefone;
		this.numDDD = numDDD;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone: (" + numDDD + ")" + numero + ", tipoTelefone :" + tipoTelefone + ".";
	}

	//getters and setters
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getNumDDD() {
		return numDDD;
	}
	public void setNumDDD(int numDDD) {
		this.numDDD = numDDD;
	}

	public String getNumCompleto() {
		return numCompleto;
	}

	public void setNumCompleto(String numCompleto) {
		this.numCompleto = numCompleto.toString();
	}
}
