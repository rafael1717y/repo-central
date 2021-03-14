package curso_java;

public class Quadrado {

	
	private double lado;
	
	//Se definir um construtor o compilador não gera mais um construtor vazio. 
	public Quadrado(double lado) {
		this.lado = lado;
	}



	public double calcularArea() {
		return lado * lado;
	}
	
	
	
	
}
