package curso_java;

public class AplicacaoEstatico {

	public static void main(String[] args) {
		
		Matematica2 m = new Matematica2();
		
		//int soma = m.somar(10, 5);
		//int subtracao = m.subtrair(50,  10);
		
		//O método não precisa ser acessado através do objeto com a transformação dos métodos para estático. 
		//Chamada diretamente na classe e não é necessário criar um objeto da classe para chamá-lo. 
		int soma = Matematica2.somar(10, 5);
		int subtracao = Matematica2.subtrair(50,  10);
		
		System.out.println(soma);
		System.out.println(subtracao);
		
		
		//Contador c1 = new Contador();
		
		System.out.println(Contador.getValor());
		Contador.incrementar();
		
		
		//Contador c2 = new Contador();
		//Contador c3 = new Contador();
		
		//Aqui incrementa para todos.
		//Contador.incrementar();
		
		
				
		System.out.println(Contador.getValor());
		

		double media = Constantes.MEDIA_DA_PROVA;
		//Não é permitida a atribuição/alteração do valor da constante.
		//Constantes.MEDIA_DA_PROVA = 10;
		
		System.out.println(media);
		
		
	}

}
