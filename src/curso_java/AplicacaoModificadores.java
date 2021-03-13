package curso_java;

public class AplicacaoModificadores {

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(322232);
		c.setAtiva(true);
		c.depositar(1000);
		c.sacar(200);

		double saldo = c.getSaldo();
		System.out.println(saldo);
		
	}

}
