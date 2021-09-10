package cocoaShop;

public class Vendedora extends Pessoa {
	private int inicioExpediente;
	private int fimExpediente;
	private int codigoVendedora;


	//custom methods
	public void status() {
		System.out.println("-----Vendedora-----");
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getNumCPF());
		System.out.println("Inicio Expediente: " + this.getInicioExpediente() + "h");
		System.out.println("Fim Expediente: " + this.getFimExpediente() + "h");
		System.out.println("Codigo Vendedora: " + this.getCodigoVendedor() + "\n");
		
		
	}
	
	//special methods
	
	
	
	//getters and setters
	
	public Vendedora(String nome, int numCPF, int inicioExp, int fimExp, int codigoVendedora) {
		this.setNome(nome);
		this.setNumCPF(numCPF);	
		this.inicioExpediente = inicioExp;
		this.fimExpediente = fimExp;
		this.codigoVendedora = codigoVendedora;
	}
	
	public int getInicioExpediente() {
		return inicioExpediente;
	}

	public void setInicioExpediente(int inicioExpediente) {
		this.inicioExpediente = inicioExpediente;
	}
	public int getFimExpediente() {
		return fimExpediente;
	}
	public void setFimExpediente(int fimExpediente) {
		this.fimExpediente = fimExpediente;
	}
	public int getCodigoVendedor() {
		return codigoVendedora;
	}
	public void setCodigoVendedora(int codigoV) {
		this.codigoVendedora = codigoV;
	}

	@Override
	public String toString() {
		return "Vendedora [inicioExpediente=" + inicioExpediente + ", fimExpediente=" + fimExpediente
				+ ", codigoVendedora=" + codigoVendedora + ", getNome()=" + getNome() + ", getNumCPF()=" + getNumCPF()
				+ "]";
	}

	
}
