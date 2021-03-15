package curso_java;

public class AplicacaoPolimorfismo2 {

	public static void main(String[] args) {
		
		LeiteQuente leite = new LeiteQuente();
		Preparador preparador = new Preparador();
		
		preparador.prepararBebida(leite);
		
		Refrigerante refrigerante = new Refrigerante();
		preparador.prepararBebida(refrigerante);
					
	}

}
