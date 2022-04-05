package gravarObjetos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Serializable {
	private String nome;
	private int id;
	private List <Livro> livros = new ArrayList<>();
	
	
	public Cliente (String nome, int id) {
		this.id = id;
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<Livro> getLivros() {
		return livros;
	}


	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", id=" + id + ", livros=" + livros + "]";
	}
	
	
}
