package sistema;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import profissoes.*;

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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void adicionarFuncionario(Profissao funcionario) {
		funcionarios.add(funcionario);
	}

	public void addMusica(String titulo, String cantor) {
		this.trilhaSonora.add(new Musica (titulo, cantor));
	}
	
	public String detalhes() {
		String output = String.format(
				"Titulo: %s\nData de Lançamento: %s\n",
				this.titulo,
				this.ano.format(DateTimeFormatter.ofPattern("MM/yyyy"))
				);
		for(Profissao p: this.funcionarios)
			output += String.format("%s\n", p);
		
		return output;
	}
	
	public String acaoFuncionario(Funcionario func) {
		String acoes = "";
		for(Profissao p: funcionarios)
			if(p.getFuncionario().equals(func))
				acoes += p.acao();
		return acoes;
	}
	
	public Funcionario isDiretor(Funcionario func) {
		for(Profissao p: funcionarios)
			if(p.acao().equals("Dirigir o filme"))
				return p.getFuncionario();
		
		return null;
	}
	
}
