package curso_java;

public class CalculadoraBonus {
	
	
	public int bonusDoDia = 1;
	
	public int bonus(Usuario2 u) {
		int multiplicador = bonusDoDia;
		if(u.vip)
			multiplicador *= 5;
		
		return multiplicador;
	}
}
