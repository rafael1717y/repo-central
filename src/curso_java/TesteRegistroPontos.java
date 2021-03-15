package curso_java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario2 u = new Usuario2();
		u.nome = "Rafael";
		
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
		
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario2 u = new Usuario2();
		u.nome = "Rafael";
		u.vip = true;		
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 25);
		
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario2 u = new Usuario2();
		u.nome = "Rafael";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 3;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 15);
		
	}
	
	@Test
	public void pontosCriarTopicoVIPBonusDoDia() {
		Usuario2 u = new Usuario2();
		u.nome = "Rafael";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 50);
		
	}	

}
