package curso_java;

public class Operacao {
	
	void trocar(int x) {
		x = 20;
		
	}
	
	void alterarValor(Valor valor) {
		//conteúdo da váriavel valor é copiado. O conteúdo da variável valor é a referência do objeto. 
		//Duas variáveis apontando para o mesmo objeto na memória. Há cópia da referência.
		//valor  = new Valor(); 
		valor.v = 20;		
	}
	

}
