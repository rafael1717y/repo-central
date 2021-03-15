package curso_java;

public class Principal {

	public static void main(String[] args) {
		
		//O objeto é único ainda que seja idêntico ao outro.
		
		Carro1 c1 = new Carro1();
		
		c1.potencia  = 10;
		c1.nome = "Corcel";
		c1.velocidade = 0;
		
		
		Carro1 c2 = new Carro1();
		c2.potencia  = 10;
		c2.nome = "Carango";
		c2.velocidade = 0;
		
		Carro1 c3 = new Carro1();
		c3.potencia  = 10;
		c3.nome = "Carango";
		c3.velocidade = 0;
		
		
						
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		
	}

}
