package interfaces;

public class Aplicacao {

	public static void main(String[] args) {
		
		Ferrari f = new Ferrari();
		Porsche p = new Porsche();
		
		f.derrapar();
		p.derrapar();
		
		//Não trabalha com nenhum objeto. Chamando um método estático dentro da interface automóvel. 
		Automovel.getVelocidadeMaxima();

	}

}
