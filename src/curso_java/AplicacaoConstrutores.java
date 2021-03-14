package curso_java;

public class AplicacaoConstrutores {
	
	public static void main(String[] args) {
		
		//Construa um objeto na memória e invoque um construtor que não recebe parâmetro.
		Retangulo r1 = new Retangulo();
		
		double area1 = r1.calcularArea();
		
		System.out.println(area1);
		
		//Usando o construtor com parâmetros
		Retangulo r2 = new Retangulo(5, 7);
		double area2 = r2.calcularArea();
		
		System.out.println(area2);
		
		
		Quadrado q = new Quadrado(6);
		System.out.println(q.calcularArea());
		
	}

}
