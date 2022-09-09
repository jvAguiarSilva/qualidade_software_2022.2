package negocio;

import java.util.ArrayList;

public class Cliente {

	protected String nome;
	protected int id;
	protected Boolean ativo;
	protected  ArrayList<Filme> filmes_favoritos;
	
	
	public Cliente() {
		filmes_favoritos= new ArrayList<Filme>();
		}
	
	public Cliente(String nome, int id, Boolean ativo) {
		this.nome= nome;
		this.id= id;
		this.ativo = ativo;
	}
}
