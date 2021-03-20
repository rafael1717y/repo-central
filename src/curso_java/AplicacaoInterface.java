package curso_java;

public class AplicacaoInterface {

	public static void main(String[] args) {
		
		Ferrari f = new Ferrari();
		
		//Rota rota = new Rota();
		
		//rota.ir(f);

		AnelBrilhante a = new AnelBrilhante();
		
		Vendedor v = new Vendedor();
		
		//Anel de Brilhante e Ferrari itens desconexos, mas tem em comum o fato de serem itens caros e assim
		//podemos ter um parametro que tem acesso ao item.getPreco(). Quando se trabalha com interfaces não se está 
		//preso a uma hierarquia dos objetos. Pode se aplicar isso a objetos de qualquer tipo. 
		v.mostraPreco(f);
		v.mostraPreco(a);
		
		
	}

}
