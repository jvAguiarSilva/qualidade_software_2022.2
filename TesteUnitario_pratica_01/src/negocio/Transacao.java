package negocio;

import java.util.ArrayList;

public class Transacao {

	protected  ArrayList<Locacao> alugueis;
	
	public Transacao() {
		
		alugueis= new ArrayList<Locacao>();
	}
	
	public double valorLocacaoTotal() {
	    double valor=0;
		for (Locacao locacao : alugueis) {
			valor +=locacao.filme.valor;
		}
		return valor;
	}
	
	public Genero generoMaisPopular() {
	    Integer qtd_ant=0;
	    Integer qtd_atu=0;
	    Genero g = Genero.COMEDIA;
	    for(Genero gen : Genero.values()){
	    	qtd_atu = 0;
	    	for (Locacao locacao : alugueis) {
	    		if (locacao.filme.genero == gen) {
	    			qtd_atu++;
	    		}
			}
	    	if (qtd_atu > qtd_ant) {
	    		qtd_ant = qtd_atu;
	    		g = gen;
	    	}
	    }
	    return g;
	}
	
	public void desconto(Genero g, Double desc) {
		for (Locacao locacao : alugueis) {
			if (locacao.filme.genero == g) {
				locacao.filme.valor = locacao.filme.valor*(100-desc);
			}
		}
	}
}
