package curso_java;

public class RegistroPontos {
	
	private CalculadoraBonus bonus;
	
	
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
		
	}
	
	public void fazerUmComentario(Usuario2 u) {
		
		u.pontos +=3 * bonus.bonus(u);
		
		
	}
	
	public void criarUmTopico(Usuario2 u) {
		u.pontos += 5 * bonus.bonus(u);
		
	}
	
	public void darUmLike(Usuario2 u) {
		u.nome +=1 * bonus.bonus(u);
		
	}

}
