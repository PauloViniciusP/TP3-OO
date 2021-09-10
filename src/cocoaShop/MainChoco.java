package cocoaShop;
public class MainChoco {
	public static void main(String[] args) {
		Bombom bb[] = new Bombom[10];
		Chocolate ch[] = new Chocolate[10];
		Trufa tf[] = new Trufa[10];
		
		//carregamento de produtos
		bb[0] = new Bombom("Chocolate", "MM", 220, 7.99, false, false, "Chocolate");
		bb[1] = new Bombom("Coco", "Garoto", 300, 10.99, true, false, "Creme");
		bb[2] = new Bombom("Meio Amargo", "Talento", 320, 14.50, true, false, "Nutela");
		bb[3] = new Bombom("Ao Leite", "Lacta", 310, 20.59, true, false, "Creme");
		bb[4] = new Bombom("Com Amendoim", "Milka", 400, 10, true, true, "Chocolate Branco");
		bb[5] = new Bombom("Laranja", "Cacau Show", 100, 10.99, true, false, "Chocolate");
		bb[6] = new Bombom("Menta", "Lindt", 120, 14.99, true, false, "Meio Amargo");
		bb[7] = new Bombom("Branco", "Laka", 200, 12.99, true, true, "Nozes");
		bb[8] = new Bombom("Branco com Caju", "Flormel", 350, 10.99, true, false, "Cereja");
		bb[9] = new Bombom("Avelã", "Hersheys", 320, 11.99, false, false, "Morango");

		ch[0] = new Chocolate("Com Amendoim", "MM", 320, 10.99, true, false, "Barra");
		ch[1] = new Chocolate("Coco", "Garoto", 320, 10.99, true, false, "Barra");
		ch[2] = new Chocolate("Meio Amargo", "Talento", 320, 10.99, true, false, "Ovo");
		ch[3] = new Chocolate("Ao Leite", "Lacta", 320, 10.99, true, false, "Ovo");
		ch[4] = new Chocolate("Morango", "Milka", 320, 10.99, true, false, "Barra");
		ch[5] = new Chocolate("Laranja", "Cacau Show", 320, 10.99, true, false, "Barra");
		ch[6] = new Chocolate("Menta", "Lindt", 320, 10.99, true, false, "Barra");
		ch[7] = new Chocolate("Branco", "Laka", 320, 10.99, true, false, "Ovo");
		ch[8] = new Chocolate("Branco com Caju", "Flormel", 320, 10.99, true, false, "Barra");
		ch[9] = new Chocolate("Avelã", "Hersheys", 320, 10.99, true, false, "O");
		
		tf[0] = new Trufa("Com Amendoim", "MM", 320, 10.99, true, false, true);
		tf[1] = new Trufa("Coco", "Garoto", 320, 10.99, true, false, true);
		tf[2] = new Trufa("Meio Amargo", "Talento", 320, 10.99, true, false, false);
		tf[3] = new Trufa("Ao Leite", "Lacta", 320, 10.99, true, false, true);
		tf[4] = new Trufa("Morango", "Milka", 320, 10.99, true, false, false);
		tf[5] = new Trufa("Laranja", "Cacau Show", 320, 10.99, true, false, false);
		tf[6] = new Trufa("Menta", "Lindt", 320, 10.99, true, false, false);
		tf[7] = new Trufa("Branco", "Laka", 320, 10.99, true, false, true);
		tf[8] = new Trufa("Branco com Caju", "Flormel", 320, 10.99, true, false, false);
		tf[9] = new Trufa("Avelã", "Hersheys", 320, 10.99, true, false, true);


	


		//Cliente cl1 = new Cliente("MM", 12007, "mm@mail", 55555, "gama");
		//Vendedora vd1 = new Vendedora("Mar", 23457, 8, 18, 1);

	


		for(int i = 0; i < 10; i++) {
			bb[i].status();
		}
		for(int i = 0; i < 10; i++) {
			ch[i].status();
		}
		for(int i = 0; i < 10; i++) {
			tf[i].status();
		}


	}

}
