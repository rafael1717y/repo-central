package curso_java;

public class AplicacaoClassesAbstratas {
	
	
	public static void main(String[] args) {
		
		Diamante d = new Diamante();
		d.pegar();
		
		Cogumelo c = new Cogumelo();
		c.pegar();
		
		Moeda m = new Moeda();
		m.pegar();
		
		
		//Ter um variável de um tipo abstracto é possível. Não pode ser criada uma instância desse tipo na memória.
		Item maca = new Maca();
		maca.pegar();
		
		
		

	}

}
