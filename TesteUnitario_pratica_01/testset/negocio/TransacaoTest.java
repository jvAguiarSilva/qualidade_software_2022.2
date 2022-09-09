package negocio;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import negocio.Cliente;
import negocio.Filme;
import negocio.Genero;
import negocio.Locacao;
import negocio.Transacao;

public class TransacaoTest {

	Transacao transacao;

	@Before
	public void setUp() throws Exception {
		transacao = new Transacao();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void valorLocacaoTotalTest() {
		Locacao locacao = new Locacao();
		Filme f = new Filme("Java", Genero.ROMANCE);
		f.valor = 100;

		Filme f2 = new Filme("JavaScript", Genero.ROMANCE);
		f2.valor = 50;
		
		Filme f3 = new Filme("Python", Genero.DRAMA);
		f3.valor = 100;

		Filme f4 = new Filme("IOT", Genero.ROMANCE);
		f4.valor = 50;

		
		locacao.alugar(new Cliente("JV", 2, true), f);
		//locacao.alugar(new Cliente("Izaias", 2, false), f2);
		
		locacao.alugar(new Cliente("Leo", 3, true), f2);
		locacao.alugar(new Cliente("Ana", 4, true), f3);
		locacao.alugar(new Cliente("Ana", 5, true), f4);

		transacao.alugueis.add(locacao);
		assertTrue(Genero.DRAMA == transacao.generoMaisPopular());
		
		
	}

}
