package curso_java;

public class AplicacaoMatematica {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		int soma = m.somar(10, 20);
		System.out.println(soma);
		
		//Sobrecarga do método somar agora com 3 parâmetros. Outra assinatura de método. 
		//A variação dos parâmetros é obrigatória para que a sobrecarga funcione. 
		int soma2 = m.somar(10, 10, 20);
		System.out.println(soma2);
		
		//Com base nos parâmetros é decidido qual dos métodos sobrecarregados é chamado.
		double soma3 = m.somar(10.0, 200.0);
		System.out.println(soma3);
		
		//Apesar de não ter nenhum método com parâmetro double e int, o java tenta encaixar em algum outro método
		//onde possa ocorrer o casting implícito. Nesse caso, converte o int 200 para double...		
		double soma4 = m.somar(10.0, 200);
		System.out.println(soma4);
		
	}

}
