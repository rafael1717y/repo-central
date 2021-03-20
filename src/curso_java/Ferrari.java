package curso_java;

public class Ferrari implements Carroo, ItemCaro {
	
	//E na classe que implementa a interface que se define o que será feito.

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou à esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Ferrari virou à direita");
		
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abriu a porta");
		
	}

	@Override
	public double getPreco() {
		
		return 1000000;
	}
	
	
	

}
