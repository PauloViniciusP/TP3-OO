package cocoaShop;
public class Cliente extends Pessoa {
	private String email;



	//custom methods
	public void status() {
		System.out.println("=====Cliente=====");
		System.out.println("Nome: " + this.getNome());
		System.out.println("CPF: " + this.getNumCPF());
		System.out.println("Email: " + this.getEmail() + "\n");
		System.out.println("Telefeone: " + this.getNumTelefone());
		System.out.println("Endereço: " + this.getEnderecoLocal());
	} 
	//special methods
	
	public Cliente(String nome, int numCPF, String em, Telefone numTele,
					Endereco enderecoLo) {
		this.setNome(nome);
		this.setNumCPF(numCPF);
		this.setEmail(em);
		this.setNumTelefone(numTele);
		this.setEnderecoLocal(enderecoLo);
	}

	//getters and setters

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
