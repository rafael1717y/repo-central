package curso_java;

public class Preparador {

	//Criação de uma estrutura genérica para preparação de uma bebida.
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a bebida " + bebida.getNome());
		bebida.preparar();
		
		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
				
		}
		
		System.out.println("Bebida preparada com sucesso!");
		
	}
}
