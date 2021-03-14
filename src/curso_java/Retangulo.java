package curso_java;

public class Retangulo {

	
	private double largura;
	private double altura;
	
	//Construtor não tem retorno.
	public Retangulo() {
		//O this deve ser a primeira instrução dentro do construtor e não pode ser chamado fora do construtor da classe.
		this(4,3);
		System.out.println("Construtor ()");
		//largura = 4;
		//altura = 3;
		
	}
	
	/* Construtor padrão que é criado quando não é definido um.
	public Retangulo() {
		
	}
	*/
	
	//Sobrecarga de construtor
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	
	public double calcularArea() {
		return altura * largura;
		
	}
}
