package curso_java;

public class Veiculo2 {
	
	protected String marca;
	
	/*
	public Veiculo2() {
		//Construtor de Object será chamado. Quando trabalha-se com construtor que não recebe parâmetros o super é opcional. 
		super();
		System.out.println("Veículo2()");
	}
	*/
	
	public Veiculo2(String marca) {
		this.marca = marca;
		System.out.println("Veiculo2(String)");
	}

}
