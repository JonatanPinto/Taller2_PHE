/**
 * 
 */
package hibernate.beans;

/**
 * @author Jonatan
 *
 */
public class Revista {

	private String isbn;
	private String nombre;
	private String editorial;
	private String tipo;

	/**
	 * 
	 */
	public Revista() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param isbn
	 * @param nombre
	 * @param editorial
	 * @param tipo
	 */
	public Revista(String isbn, String nombre, String editorial, String tipo) {
		super();
		this.isbn = isbn;
		this.nombre = nombre;
		this.editorial = editorial;
		this.tipo = tipo;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return isbn + "," + nombre + "," + editorial + "," + tipo;
	}

}
