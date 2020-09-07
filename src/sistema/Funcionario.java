package sistema;

/***
 * Representa um funcionario
 * @author Otavio
 * @author Rafael
 *
 */
public class Funcionario {
	
	private String nome;

	public Funcionario(String nome) {
		this.nome = nome;
	}
	
	/***
	 * Retorna o nome desse funcionario
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/***
	 * Altera o nome desse funcionario
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
