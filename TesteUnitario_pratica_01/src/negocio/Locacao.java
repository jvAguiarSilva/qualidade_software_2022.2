package negocio;
import java.time.LocalDate;

public class Locacao {

	protected Cliente cliente;
	protected Filme filme;
	protected LocalDate data;
	
	public void alugar(Cliente c, Filme f) {
		if (cliente.ativo == true) {
			this.cliente = c;
			this.filme = f;
			this.data = LocalDate.now();
		}
		else {
			System.out.println("Cliente Inativo");
		}
	}
	
	
}
