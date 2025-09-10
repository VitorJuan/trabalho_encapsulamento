package faculdade.trabalho_encapsulamento;

public class Livro {

	private String titulo;
	private String autor;
	private int paginas;
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setPaginas(int paginas) {
		if (paginas <= 0) {
			System.out.println("Erro, valor da pagina nao pode ser menor ou igual a zero");
			System.exit(1);
		}
		
		this.paginas = paginas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getPaginas() {
		return paginas;
	}
	
	public String getInfo() {
		return "Titulo: " + titulo + "; Autor: " + autor + "; Paginas: " + paginas;
	}
	
}
