package curso_java;

public abstract class Item {
	
	//Classe abstrata não pode ser instanciada, mas se pode criar objetos de subclasse de item.
	//Um classe abstr. não precisa ter só métodos abstratos
	
	private int posX;
	private int posY;
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	//tbm deve ser implementado quando herdado.
	public abstract void pegar();
	}
	

