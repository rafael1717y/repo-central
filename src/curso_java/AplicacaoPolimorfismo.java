package curso_java;

public class AplicacaoPolimorfismo {

	public static void main(String[] args) {
			
		//A variável c é do tipo cachorro e também animal. 
		//Cachorro c = new Cachorro();
		//c.falar();
		
		//A variável criada na memória é um cachorro. Animal é apenas uma forma de referenciar esse objeto. 
		Animal c = new Cachorro();
		//c.falar - vai verificar qual o objeto referenciado na memória e chamá-lo.
		c.falar();
		
		Cachorro d = new Cachorro();
		d.morder();
		
		
				
		//chamando o método morder que é do cachorro através de casting explícito uma vez que nem todo animal é um cachorro.
		Animal a = new Cachorro();
		if (a instanceof Cachorro) {
			Cachorro e = (Cachorro) a;
			e.morder();
		}
				
	}

}
