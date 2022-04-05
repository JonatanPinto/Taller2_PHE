/**
 * 
 */
package hibernate.beans;

/**
 * @author Jonatan
 *
 */
public class Area {

	private String claveArea;
	private String nombre;

	public Area() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param claveArea
	 * @param nombre
	 */
	public Area(String claveArea, String nombre) {
		super();
		this.claveArea = claveArea;
		this.nombre = nombre;
	}

	/**
	 * @return the claveArea
	 */
	public String getClaveArea() {
		return claveArea;
	}

	/**
	 * @param claveArea the claveArea to set
	 */
	public void setClaveArea(String claveArea) {
		this.claveArea = claveArea;
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

	@Override
	public String toString() {
		return "Area= " + claveArea + ", " + nombre;
	}
}
