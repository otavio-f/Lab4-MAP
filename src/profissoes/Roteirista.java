package profissoes;

import sistema.Funcionario;

/***
 * Classe abstrata que representa uma função
 * @author Otavio
 * @author Rafael
 *
 */
public class Roteirista extends Profissao {
	
	public Roteirista(Funcionario func) {
		super(func);
	}

	@Override
	public String acao() {
		return "Cria roteiros";
	}
	
	@Override
	public String toString() {
		return String.format("Roteirista: %s\n", this.getFuncionario());
	}

}
