package curso_java;

public class Carro2 extends Veiculo2 {
		
	/*
	public Carro2() {
		//Aqui acontece a chamada da classe acima (Veículo). 
		//super();
		System.out.println("Carro2()");
		
	}
	*/	
	
	//Não construção de uma carro2 é fornecida uma marca, mas para construir uma veículo também precisa-se de uma marca
	//Assim chama-se o super (para chamar o construtor de veículo) passando essa marca que o carro2 recebeu.
	public Carro2(String marca) {
		super(marca);
		System.out.println("Carro()");
	}
		
}
