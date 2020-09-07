package profissoes;

import sistema.Funcionario;

/***
 * Classe abstrata que representa uma função
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
		return "Manuseia a câmera";
	}

	@Override
	public String toString() {
		return String.format("Cinegrafista: %s\n", this.getFuncionario());
	}
}
