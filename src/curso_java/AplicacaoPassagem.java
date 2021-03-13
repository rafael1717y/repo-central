package curso_java;

public class AplicacaoPassagem {
	
	public static void main(String[] args) {
		
		Operacao o = new Operacao();
		
		//** Situação 1 **
		//Criação da variável na stack com valor 10. 
		int x = 10;

		
		//O conteúdo da variável passado com parâmetro é copiado. Só passagem de parâmetro por cópia.
		//Nesse caso, é criado uma cópia do valor de x ao chamar método trocar. 
		//Há a troca do valor de n e não de x em void trocar (int n).
		
		o.trocar(x);
		System.out.println(x);
		
		
		//** Situação II **
		//Não existe passagem por referência em java. Continua sendo uma cópia mas funciona de uma forma diferente. 
		Valor valor = new Valor(); //armazena uma referência para um objeto no heap - ponteiro. Conteúdo da var valor é um ponteiro. 
		valor.v = 10;
		o.alterarValor(valor);
		System.out.println(valor.v);
	
	
	}

}
