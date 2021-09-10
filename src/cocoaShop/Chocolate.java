package cocoaShop;

public class Chocolate extends Produto {
	
	private String tipo;

	
	//custom methods
	public void status() {
		System.out.println("**************");
		System.out.println("Sobre o chocolate:");
		System.out.println("Sabor: " + this.getSabor());
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Peso: " + this.getPeso() + "g");
		System.out.println("Preço: " + this.getPreço());
		System.out.println("Zero Açucar: " + this.isZeroAçucar());
		System.out.println("Zero Lactose: " + this.isZeroLactose());
		System.out.println("Tipo: " + this.getTipo()+"\n");
	}
	/*public String consultarAlunosMatriculados() {
		String saida = "***** Lista de Alunos Matriculados ***** \n" ;
		for(int i = 0; i < numAlunos; i++) {
			System.out.println(i);
			saida = saida + "\n"+ alunosMatriculados[i].getAluno().toString();
		}
		return saida;
	}	*/

	//special methods
	public Chocolate(String sabor, String marca, int peso, double preço,
			         boolean zeroAçucar, boolean zeroLactose, String tipo) {
		
		this.setSabor(sabor);
		this.setMarca(marca);
		this.setPeso(peso);;
		this.setPreço(preço);;
		this.setZeroAçucar(zeroAçucar);;
		this.setZeroLactose(zeroLactose);;
		this.setTipo(tipo);
	}
	//getters and setters
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	//special methods
	


	

}
