package profissoes;

import sistema.Funcionario;

/***
 * Classe abstrata que representa uma função
 * @author Otavio
 * @author Rafael
 *
 */
public class Diretor extends Profissao {

	public Diretor(Funcionario func) {
		super(func);
	}
	
	@Override
	public String acao() {
		return "Dirige o filme";
	}
	
	@Override
	public String toString() {
		return String.format("Diretor: %s\n", this.getFuncionario());
	}

}
