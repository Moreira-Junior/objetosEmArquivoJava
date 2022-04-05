package gravarObjetos;

public class Exemplo {
	public static void main(String[] args) throws Exception {
	
		Biblioteca biblioteca = new Biblioteca();
		
//		Livro livro = new Livro ("Hobbit", "Tolkien", 1);
//		Livro livro2 = new Livro ("Silmarillion", "Tolkien", 2);
//		
//		Cliente cliente = new Cliente ("João",1);
//		Cliente cliente2 = new Cliente ("Pedro",2);
//		
//		cliente.getLivros().add(livro);
//		cliente.getLivros().add(livro2);
//		
//		biblioteca.getClientes().add(cliente);
//		biblioteca.getClientes().add(cliente2);
//		
//		biblioteca.getLivros().add(livro);
//		biblioteca.getLivros().add(livro2);
//		
//		biblioteca.gravarClientes();
//		biblioteca.gravarLivros();
		
		biblioteca.lerClientes();
		biblioteca.lerLivros();
		
		System.out.println(biblioteca);
//		
//		try {
//			FileOutputStream fos = new FileOutputStream ("src/gravarObjetos/cliente.txt");
//			ObjectOutputStream oos = new ObjectOutputStream (fos);
//			oos.writeObject(cliente);
//			oos.close();
//			
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());		}
//		
//		try {
//			FileOutputStream fos = new FileOutputStream ("src/gravarObjetos/livro.txt");
//			ObjectOutputStream oos = new ObjectOutputStream (fos);
//			oos.writeObject(livro);
//			oos.close();
//			
//		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			
//			FileInputStream fis = new FileInputStream("src/gravarObjetos/livro.txt");
//			ObjectInputStream ois = new ObjectInputStream (fis);
//			Livro livroLido = (Livro)ois.readObject();
//			ois.close();
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		List<Cliente> clientes = new ArrayList<>();
//		clientes.add(cliente);
//		clientes.add(cliente2);
//		
//		
//		try {
//			FileOutputStream fos = new FileOutputStream("src/gravarObjetos/clientes.txt");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(clientes);
//			oos.close();
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try{
//			FileInputStream fis = new FileInputStream("src/gravarObjetos/clientes.txt");
//			ObjectInputStream ois = new ObjectInputStream (fis);
//			List<Cliente> clientesTemp = (List<Cliente>)ois.readObject();
//			
//		}
//		catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	
		
	}
}
