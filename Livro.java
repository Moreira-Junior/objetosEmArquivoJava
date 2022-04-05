package gravarObjetos;

import java.io.Serializable;

public class Livro implements Serializable {
	
	private String titulo;
	private String autor;
	private int id;
	
	public Livro(String titulo, String autor, int id) {
		this.autor = autor;
		this.titulo = titulo;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", id=" + id + "]";
	}
	
	
}
