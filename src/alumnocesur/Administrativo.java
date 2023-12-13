package alumnocesur;

public class Administrativo extends Persona {
	//	ATRIBUTOS
	private boolean idiomas;

	public Administrativo(String nombre, int edad, boolean idiomas) {
		super(nombre, edad);
		this.idiomas = idiomas;
	}

	public Administrativo(String nombre) {
		super(nombre, 0);
		this.idiomas = false;
	}

	public boolean isIdiomas() {
		return idiomas;
	}

	public void setIdiomas(boolean idiomas) {
		this.idiomas = idiomas;
	}
	
	
	
	
	

}
