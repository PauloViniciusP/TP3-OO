package cocoaShop;

public abstract class Pessoa {
	private String nome;
	private int numCPF;
	private Telefone numTelefone;
	private Endereco enderecoLocal;
	
	//Special methods
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumCPF() {
		return numCPF;
	}

	public void setNumCPF(int numCPF) {
		this.numCPF = numCPF;
	}

	public Telefone getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(Telefone numTelefone) {
		this.numTelefone = numTelefone;
	}

	public Endereco getEnderecoLocal() {
		return enderecoLocal;
	}

	public void setEnderecoLocal(Endereco enderecoLocal) {
		this.enderecoLocal = enderecoLocal;
	}

	@Override
	public String toString() {
		return "Pessoa [nome:" + nome + ", numCPF:" + numCPF + ", "
				+ "numTelefone:" + numTelefone + ", enderecoLocal:"
				+ enderecoLocal + "]";
	}
	
	
}
