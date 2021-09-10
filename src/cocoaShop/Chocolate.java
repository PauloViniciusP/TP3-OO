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
		System.out.println("Pre�o: " + this.getPre�o());
		System.out.println("Zero A�ucar: " + this.isZeroA�ucar());
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
	public Chocolate(String sabor, String marca, int peso, double pre�o,
			         boolean zeroA�ucar, boolean zeroLactose, String tipo) {
		
		this.setSabor(sabor);
		this.setMarca(marca);
		this.setPeso(peso);;
		this.setPre�o(pre�o);;
		this.setZeroA�ucar(zeroA�ucar);;
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
