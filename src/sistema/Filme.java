package sistema;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import profissoes.*;

/***
 * Classe que contém os dados de um filme
 * @author Otavio
 * @author Rafael
 *
 */
public class Filme {
	private String titulo;
	private YearMonth ano;
	private List<Profissao> funcionarios;
	private List<Musica> trilhaSonora;
	
	public Filme(String titulo, YearMonth ano) {
		this.titulo = titulo;
		this.ano = ano;
		this.funcionarios = new ArrayList<Profissao>();
		this.trilhaSonora = new ArrayList<Musica>();
	}

	public Filme(String titulo, String data) {
		this.titulo = titulo;
		this.ano = YearMonth.parse(data, DateTimeFormatter.ofPattern("MM/yyyy"));
		this.funcionarios = new ArrayList<Profissao>();
		this.trilhaSonora = new ArrayList<Musica>();
	}

	/***
	 * Retorna o título do filme
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	/***
	 * Altera o título do filme
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	/***
	 * Adiciona um funcionario ligado a uma profissão
	 * @param funcionario
	 */
	public void adicionarFuncionario(Profissao funcionario) {
		funcionarios.add(funcionario);
	}

	/***
	 * Cria uma música e armazena
	 * @param titulo
	 * @param cantor
	 */
	public void addMusica(String titulo, String cantor) {
		this.trilhaSonora.add(new Musica (cantor, titulo));
	}
	
	/***
	 * Lista os detalhes desse filme
	 * @return
	 */
	public String detalhes() {
		String output = String.format(
				"\nTitulo: %s\nData de Lançamento: %s\n",
				this.titulo,
				this.ano.format(DateTimeFormatter.ofPattern("MM/yyyy"))
				);
		output += "\nMúsicas:\n";
		for(Musica m: this.trilhaSonora)
			output += String.format("%s", m);
		output += "\n";
		for(Profissao p: this.funcionarios)
			output += String.format("%s", p);
		
		return output;
	}
	
	/***
	 * Retorna a função de um funcionario nesse filme
	 * @param func
	 * @return
	 */
	public String acaoFuncionario(Funcionario func) {
		String acoes = "";
		for(Profissao p: funcionarios)
			if(p.getFuncionario().equals(func))
				acoes += p.acao();
		return acoes;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		if (ano == null) {
			if (other.ano != null)
				return false;
		} else if (!ano.equals(other.ano))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public String toString() {
		return String.format("Filme: %s", titulo);
	}
	
}
