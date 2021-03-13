package curso_java;

public class Pessoa {

	String nome;
	int numFigurinhas;
	
	void receber(int numFigurinhas) {
		//this.numFigurinhas referencia o atributo numFigurinhas.
		this.numFigurinhas += numFigurinhas;
		
	}
	
	void dar(int numFigurinhas, Pessoa p) {
		this.numFigurinhas -= numFigurinhas;
		//p.numFigurinhas += numFigurinhas;
		p.receber(numFigurinhas);
	}
	
}
