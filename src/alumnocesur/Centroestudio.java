package alumnocesur;

public class Centroestudio {
	// ATRIBUTOS
	private String nombre;
	private Clase[] clases;
	private Administrativo[] administrativos;
	private final int MAX_ADMIN;
	private final int MAX_CLASES;

//CONSTRUCTORES
	public Centroestudio(String nombre, int mAX_CLASES , int mAX_ADMIN) {
		super();
		this.nombre = nombre;
		MAX_ADMIN = mAX_ADMIN;
		MAX_CLASES = mAX_CLASES;
		administrativos = new Administrativo[MAX_ADMIN];
		clases = new Clase[MAX_CLASES];
	}

	public Centroestudio(String nombre) {
		super();
		this.nombre = nombre;
		MAX_ADMIN = 10;
		MAX_CLASES = 10;
		administrativos = new Administrativo[MAX_ADMIN];
		clases = new Clase[MAX_CLASES];
	}
	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Clase[] getClases() {
		return clases;
	}

	public void setClases(Clase[] clases) {
		this.clases = clases;
	}

	public Administrativo[] getAdministrativos() {
		return administrativos;
	}

	public void setAdministrativos(Administrativo[] administrativos) {
		this.administrativos = administrativos;
	}

	public int getMAX_ADMIN() {
		return MAX_ADMIN;
	}

	public int getMAX_CLASES() {
		return MAX_CLASES;
	}
	public String toString() {
		return("["+ "Centro: "+nombre + ",clases" +MAX_CLASES+"Admin: " +MAX_ADMIN+ "]");
		
	}

}
