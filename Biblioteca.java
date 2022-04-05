package gravarObjetos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Cliente> clientes = new ArrayList<>();
	private List<Livro> livros = new ArrayList<>();
	
	
	public void gravarClientes() {
		try {
			FileOutputStream fos = new FileOutputStream("src/gravarObjetos/clientes.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.clientes);
			oos.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void lerClientes() {
		try{
			FileInputStream fis = new FileInputStream("src/gravarObjetos/clientes.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			this.clientes = (List<Cliente>)ois.readObject();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void gravarLivros() {
		try {
			FileOutputStream fos = new FileOutputStream("src/gravarObjetos/livros.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(this.livros);
			oos.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void lerLivros() {
		try{
			FileInputStream fis = new FileInputStream("src/gravarObjetos/livros.txt");
			ObjectInputStream ois = new ObjectInputStream (fis);
			this.livros = (List<Livro>)ois.readObject();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	@Override
	public String toString() {
		return "Biblioteca [clientes=" + clientes + ", livros=" + livros + "]";
	}
	
	
	
}
