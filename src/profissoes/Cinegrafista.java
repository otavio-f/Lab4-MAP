package profissoes;

import sistema.Funcionario;

/***
 * Classe abstrata que representa uma fun��o
 * @author Otavio
 * @author Rafael
 *
 */
public class Cinegrafista extends Profissao {

	public Cinegrafista(Funcionario func) {
		super(func);
	}
	
	@Override
	public String acao() {
		return "Manuseia a c�mera";
	}

	@Override
	public String toString() {
		return String.format("Cinegrafista: %s\n", this.getFuncionario());
	}
}
