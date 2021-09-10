package cocoaShop;

public class Venda {
	private String formaPagamento;
	private int valorTotal;
	
	private Chocolate ch[] = new Chocolate[10];
	{	
	ch[0] = new Chocolate("Com Amendoim", "MM", 320, 10.99, true, false, "Barra");
	ch[1] = new Chocolate("Coco", "Garoto", 320, 10.99, true, false, "Barra");
	ch[2] = new Chocolate("Meio Amargo", "Talento", 320, 10.99, true, false, "Barra");
	ch[3] = new Chocolate("Ao Leite", "Lacta", 320, 10.99, true, false, "Barra");
	ch[4] = new Chocolate("Morango", "Milka", 320, 10.99, true, false, "Barra");
	ch[5] = new Chocolate("Laranja", "Cacau Show", 320, 10.99, true, false, "Barra");
	ch[6] = new Chocolate("Menta", "Lindt", 320, 10.99, true, false, "Barra");
	ch[7] = new Chocolate("Branco", "Laka", 320, 10.99, true, false, "Barra");
	ch[8] = new Chocolate("Branco com Caju", "Flormel", 320, 10.99, true, false, "Barra");
	ch[9] = new Chocolate("Avelã", "Hersheys", 320, 10.99, true, false, "Barra");
	}

	//custom methods

	//special methods
	public Venda(String formaPagamento, int valorTotal) {
		this.formaPagamento = formaPagamento;
		this.valorTotal = valorTotal;
	}

	//getters and setters
	public String getFormaPagamento() {
		return formaPagamento;
	}
	
	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	public int getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(int valorTotal) {
		this.valorTotal = valorTotal;
	}
}
