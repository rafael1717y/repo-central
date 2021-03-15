package curso_java;

public class Carro extends Veiculo {
	
	private boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	@Override
	public void imprimirDados() {
		//System.out.println("Marca: " + marca);
		//System.out.println("Modelo: " + modelo);
		//System.out.println("Ano: " + ano);
		
		//E possível chamar o método que se está sobrescrevendo quando se sobrescreve um método.
		//super.imprimirDados chama o método da super classe que se está sobrescrevendo aqui. 
		//this referencia o próprio objeto. Super da superclasse. Evita-se duplicação de código.
		
		super.imprimirDados();
		System.out.println("Quatro portas: " + quatroPortas);
	}
}
