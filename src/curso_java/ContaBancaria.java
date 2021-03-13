package curso_java;

public class ContaBancaria {
	
	//Todos os atributos devem ser criados com private quando da criação da classe.
	//Não criar getters e setters e trabalhar com a validação. 
	
	private int numConta;
	private boolean ativa;
	private double saldo;
	
	public void sacar(double valor) {
		if (valor < 0 ) {
			return;
		}
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		if (valor < 0) {
			return;
		}
		saldo += valor;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		if (numConta > 0) {
			this.numConta = numConta;
		}
	}	
	
	public boolean isAtiva() {
		return ativa;
	}
	
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//O saldo deve ser alterado pelos métodos sacar ou depositar.
	//public void setSaldo(double saldo) {
		
		//this.saldo = saldo;
	//}
	
	

}
