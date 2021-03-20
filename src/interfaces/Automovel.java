package interfaces;

public interface Automovel {
	
	void acelerar();
	void frear();
	
	//quando define default na interface pode acontecer implementação...
	default void derrapar() {
		acelerar();
		acelerar();
		frear();
	}
	
	static int getVelocidadeMaxima() {
		return 300;
	}
	
	

}
