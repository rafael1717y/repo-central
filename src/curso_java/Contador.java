package curso_java;

public class Contador {

	//Atributo static compartilhado para todas as instâncias da classe.
	private static int valor;
	
	static {
		valor = 1;
	}
	
	//public Contador() {
		//valor = 1;
	//}
	
	public static void incrementar() {
		valor++;
	}

	public static int getValor() {
		return valor;
	}

	
	
	
	
	
}
