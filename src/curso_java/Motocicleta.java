package curso_java;

public class Motocicleta extends Veiculo {
	
	//Não é permitido herança múltipla. Se não definir nada herda-se de Object.
	//Método abaixo é específico da classe motocicleta. Não faz sentido colocá-lo na classe veículo, por exemplo, em função do modelo.
	
	public void empinar() {
		System.out.println("UHU");
	}
		
}
