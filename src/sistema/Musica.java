package sistema;

/***
 * Classe que representa uma música
 * @author Rafael
 * @author Otavio
 *
 */
public class Musica {
	private String cantor;
	private String titulo;
	
	public Musica (String cantor, String titulo) {
		this.cantor = cantor;
		this.titulo = titulo;
	}
	public String toString () {
		return String.format("titulo: %s - cantor: %s\n", this.titulo, this.cantor);
	}
}
