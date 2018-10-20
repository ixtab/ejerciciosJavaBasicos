package ejerciciomodelarobjetos;

public class Libro {

	protected String titulo;
	protected String isbn;
	protected boolean abierto = false;
	protected int numPaginas;
	protected int paginaActual = 0;
	
	public void abrir(){
		abierto = true;
		System.out.println("Abierto por la página " + paginaActual);
	}
	
	public void cerrar(){
		abierto = false;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isAbierto() {
		return abierto;
	}
	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public int getPaginaActual() {
		return paginaActual;
	}
	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}
	
	
}
