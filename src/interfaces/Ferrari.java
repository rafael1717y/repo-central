package interfaces;

public class Ferrari implements Automovel {

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}

	@Override
	public void frear() {
		System.out.println("Ferrari freou");
		
	}

	//não precisa implementar o método derrapar aqui pq foi implementado por default na interface.
			
	
}
