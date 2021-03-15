package curso_java;

public class AplicacaoHeranca {

	public static void main(String[] args) {
		
		System.out.println("Carro");
		//O tipo carro tem acesso aos métodos da classe Veículo.
				
		Carro c = new Carro();
		
		
		c.setMarca("XYZ");
		c.setModelo("ABC");
		c.setAno(2000);
		c.setQuatroPortas(true);
		c.imprimirDados();
		//c.buzinar();
					
		//Veiculo v = new Veiculo();
		//v.buzinar();
		//v.imprimirDados();
		//v.setMarca("AAA");
		//v.setModelo("BBB");
		//v.setAno(2000);
		
		System.out.println("Motocicleta");
		Motocicleta m = new Motocicleta();
		m.setMarca("QQQ");
		m.setModelo("ZZZ");
		m.setAno(2010);
		m.imprimirDados();
		//m.buzinar();
		//m.empinar();
		
		
		Caminhao cam = new Caminhao();
		cam.buzinar();
		
	}

}
